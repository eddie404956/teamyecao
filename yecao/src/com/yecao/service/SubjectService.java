package com.yecao.service;

import java.util.List;

import com.yecao.bean.Subject;
import com.yecao.mapper.CommentMapper;
import com.yecao.mapper.SubjectMapper;
import com.yecao.mapper.UserMapper;

public class SubjectService {

	private SubjectMapper subjectMapper;
	
	private CommentMapper commentMapper;
	
	private UserMapper userMapper;
	
	public void addSubject(Subject subject){
		subjectMapper.addSubject(subject);
	}
	
	public List<Subject> getSubjects(int page){
		List<Subject> subjects=subjectMapper.getSubjects(page);
//		for(Subject s:subjects){
//			s.setUser(userMapper.selectOne(s.getUserId()));
//			s.setComments(commentMapper.getBySubjectId(s.getId()));
//		}
		return subjects;
		
	}
	public Subject getSubjectDetail(String id){
		Subject s=subjectMapper.selectOne(id);
		s.setUser(userMapper.selectOne(s.getUserId()));
		s.setComments(commentMapper.getBySubjectId(s.getId()));
		return s;
	}
}
