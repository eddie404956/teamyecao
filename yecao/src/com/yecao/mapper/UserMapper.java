package com.yecao.mapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.yecao.bean.User;

@Component("UserMapper")
public class UserMapper {
	@Autowired
	private JdbcTemplate t = null;

	public static final String ADD_USER = "INSERT INTO user(id,name,password,webchat,email,cellphone,qq,createtime)VALUES(?,?,?,?,?,?,?,?)";
	
	public static final String DEL_USER = "DELETE FROM user where id=?";
	
	public static final String UPDATE_USER = "UPDATE user SET name=?,password=?,webchat=?,email=?,cellphone=?,qq=?,createtime=? where id=?";
	
	public static final String SELECT_USER = "SELECT * FROM user where id='";

	public void addUser(final User user) {

		t.update(ADD_USER, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, user.getId());
				ps.setString(2, user.getName());
				ps.setString(3, user.getPassword());
				ps.setString(4, user.getWebchat());
				ps.setString(5, user.getEmail());
				ps.setString(6, user.getCellphone());
				ps.setString(7, user.getQq());
				ps.setString(8, user.getCreateTime());
			}});
	}

	public void delUser(final String id) {
		t.update(DEL_USER, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, id);
			}});
	}

	public void modify(final User user) {
		t.update(UPDATE_USER, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, user.getName());
				ps.setString(2, user.getPassword());
				ps.setString(3, user.getWebchat());
				ps.setString(4, user.getEmail());
				ps.setString(5, user.getCellphone());
				ps.setString(6, user.getQq());
				ps.setString(7, user.getCreateTime());
				ps.setString(8, user.getId());
			}});
	}

	public User selectOne(String id) {
		return t.queryForObject(SELECT_USER+id+"'", new RowMapper<User>() {

			public User mapRow(ResultSet rs, int arg1) throws SQLException {
				User user=new User();
				user.setId(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				user.setWebchat(rs.getString("webchat"));
				user.setEmail(rs.getString("email"));
				user.setCellphone(rs.getString("cellphone"));
				user.setQq(rs.getString("qq"));
				user.setCreateTime(rs.getString("createtime"));
				return user;
			}
		});
	}

	public JdbcTemplate getT() {
		return t;
	}

	public void setT(JdbcTemplate t) {
		this.t = t;
	}
	
	
}
