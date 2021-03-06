package com.yecao.service;

import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yecao.bean.Pic;
import com.yecao.bean.Subject;
import com.yecao.bean.Util;
import com.yecao.mapper.CommentMapper;
import com.yecao.mapper.PicMapper;
import com.yecao.mapper.SubjectMapper;
import com.yecao.mapper.UserMapper;

@Component("SubjectService")
public class SubjectService {

	@Autowired
	private SubjectMapper subjectMapper;
	@Autowired
	private CommentMapper commentMapper;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private PicMapper picMapper;
	
	public void addSubject(Subject subject,InputStream is){
		subject.setId(Util.getId());
		subject.getUser().setId(Util.getId());
		
		Pic pic=new Pic();
		pic.setId(Util.getId());
		pic.setInputStream(is);
		picMapper.addPic(pic);
		
		subject.setPicId(pic.getId());
		subjectMapper.addSubject(subject);
		
	}
	
	public List<Subject> getSubjects(int page){
		List<Subject> subjects=subjectMapper.getSubjects(page);
		for(Subject s:subjects){
//			s.setUser(userMapper.selectOne(s.getUserId()));
//			s.setComments(commentMapper.getBySubjectId(s.getId()));
		}
		return subjects;
		
	}
	public Subject getSubjectDetail(String id){
		Subject s=subjectMapper.selectOne(id);
		s.setUser(userMapper.selectOne(s.getUserId()));
		s.setComments(commentMapper.getBySubjectId(s.getId()));
		return s;
	}
}
