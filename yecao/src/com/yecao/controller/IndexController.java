package com.yecao.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.yecao.bean.Subject;
import com.yecao.service.SubjectService;

public class IndexController implements Controller {

	@Autowired
	private SubjectService subjectService;
	
	private static SimpleDateFormat format=new SimpleDateFormat("yyyyMMddhhmmss");

	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		String page=req.getParameter("page");
		int index=0;
		try{
			index=Integer.parseInt(page);
		}catch(Exception e){}
		
		List<Subject> subjects=subjectService.getSubjects(index);
		ModelAndView mv = new ModelAndView();
		// 添加模型数据 可以是任意的POJO对象
		mv.addObject("subjects", subjects);
		// 设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
		mv.setViewName("index");
		return mv;
	}

}
