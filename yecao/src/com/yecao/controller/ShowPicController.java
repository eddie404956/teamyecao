package com.yecao.controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.yecao.bean.Pic;
import com.yecao.bean.Subject;
import com.yecao.bean.User;
import com.yecao.mapper.PicMapper;
import com.yecao.service.SubjectService;

public class ShowPicController implements Controller {

	@Autowired
	private PicMapper mapper;
	
	private static SimpleDateFormat format=new SimpleDateFormat("yyyyMMddhhmmss");

	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		 resp.setContentType("image/jpeg");
		String id=req.getParameter("pic");
		Pic pic=mapper.selectOne(id);
		InputStream is=pic.getInputStream();
		if(is!=null){
			ServletOutputStream os=resp.getOutputStream();
			byte buffer[]=new byte[4096];
			int len=-1;
			while((len=is.read(buffer))!=-1){
				os.write(buffer, 0, len);
			}
			os.flush();
		}
		
//		ModelAndView mv = new ModelAndView();
		// 设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
//		mv.setViewName("index");
		return null;
	}

}
