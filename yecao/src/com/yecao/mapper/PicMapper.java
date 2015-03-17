package com.yecao.mapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.yecao.bean.Pic;

@Component("PicMapper")
public class PicMapper {

	@Autowired
	private JdbcTemplate t = null;

	public static final String ADD_Pic = "INSERT INTO PIC(" +
			"id," +
			"pic)VALUES(?" +
			",?" +
			")";

	public static final String DEL_Pic = "DELETE FROM PIC where id=?";

	public static final String SELECT_ONE_Pic = "SELECT * FROM PIC where id='";

	public void addPic(final Pic pic) {
		t.update(ADD_Pic, new PreparedStatementSetter() {

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, pic.getId());
				ps.setBinaryStream(2, pic.getInputStream());
			}
		});
	}

	public void delete(final String id) {
		t.update(DEL_Pic, new PreparedStatementSetter() {

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, id);
			}
		});
	}

	public Pic selectOne(String id) {
		return t.queryForObject(SELECT_ONE_Pic + id + "'",
				new RowMapper<Pic>() {

					public Pic mapRow(ResultSet rs, int arg1)
							throws SQLException {
						Pic pic = new Pic();
						pic.setId(rs.getString("id"));
						pic.setInputStream(rs.getBlob("pic").getBinaryStream());
						return pic;
					}
				});
	}
}
