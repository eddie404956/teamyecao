package com.yecao.controller;

import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import org.springframework.web.servlet.ModelAndView;  
import org.springframework.web.servlet.mvc.Controller; 

public class AddSubjectController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		 ModelAndView mv = new ModelAndView();  
	       //添加模型数据 可以是任意的POJO对象  
	       mv.addObject("message", "Hello World!");  
	       //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面  
	       mv.setViewName("addsubject");  
	       return mv;  
	}

	

}
