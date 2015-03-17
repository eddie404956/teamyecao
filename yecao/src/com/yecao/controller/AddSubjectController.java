package com.yecao.controller;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.yecao.bean.Subject;
import com.yecao.bean.User;
import com.yecao.service.SubjectService;

public class AddSubjectController implements Controller {

	@Autowired
	private SubjectService subjectService;
	
	private static SimpleDateFormat format=new SimpleDateFormat("yyyyMMddhhmmss");

	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		// ת��ΪMultipartHttpRequest��
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) req;
		// ����ļ���
		MultipartFile file = multipartRequest.getFile("pic");
		InputStream pic = file.getInputStream();
		Subject subject=new Subject();
		subject.setTitle(req.getParameter("title"));
		subject.setContent(req.getParameter("content"));
		subject.setCreateTime(format.format(new Date()));
		User user=new User();
		user.setId("1234");
		user.setName("admin");
		subject.setUser(user);
		subjectService.addSubject(subject, pic);
		ModelAndView mv = new ModelAndView();
		// ���ģ������ �����������POJO����
		mv.addObject("message", "Hello World!");
		// �����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��
		mv.setViewName("index");
		return mv;
	}

}
