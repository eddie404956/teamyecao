package com.yecao.mapper;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.yecao.bean.Comment;

public class CommentMapper {
	
public static final String ADD_COMMENT = "INSERT INTO comment(content,time,userid,subjectid)VALUES(?,?,?,?)";
	
	public static final String DEL_COMMENT = "DELETE FROM comment where id=?";
	private JdbcTemplate t = null;

	public void addComment(final String subjectid, final Comment comment) {
		t.update(ADD_COMMENT, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, comment.getContent());
				ps.setString(2, comment.getTime());
				ps.setString(3, comment.getUser().getId());
				ps.setString(4, subjectid);
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
		// TODO Auto-generated method stub
		return null;
	}
	

}
