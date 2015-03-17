package com.yecao.mapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.yecao.bean.Comment;
import com.yecao.bean.Subject;

@Component("CommentMapper")
public class CommentMapper {
	
public static final String ADD_COMMENT = "INSERT INTO comment(id,content,time,userid,subjectid)VALUES(?,?,?,?,?)";
	
	public static final String DEL_COMMENT = "DELETE FROM comment where id=?";
	
	public static final String SELECT_COMMENT = "SELECT * FROM comment where subjectid=?";
	@Autowired
	private JdbcTemplate t = null;

	public void addComment(final String subjectid, final Comment comment) {
		t.update(ADD_COMMENT, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, comment.getId());
				ps.setString(2, comment.getContent());
				ps.setString(3, comment.getTime());
				ps.setString(4, comment.getUserId());
				ps.setString(5, subjectid);
			}});
	}
	public void delComment( final String  commentId) {
		t.update(DEL_COMMENT, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, commentId);
			}});
	}
	public JdbcTemplate getT() {
		return t;
	}
	public void setT(JdbcTemplate t) {
		this.t = t;
	}
	public List<Comment> getBySubjectId(String id) {
		return t.query(SELECT_COMMENT,new RowMapper() {

			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				Comment subject=new Comment();
				subject.setId(rs.getString("id"));
				subject.setTime(rs.getString("time"));
				subject.setContent(rs.getString("content"));
				subject.setSubjectId(rs.getString("subjectid"));
				subject.setUserId(rs.getString("userid"));
				return subject;
			}
		});
	}
	

}
