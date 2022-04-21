package com.simplilearn.demo;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

//use autowire this EproductDao object to main controller
@Repository
public class EProductDAO {

	@Autowired
	JdbcTemplate template;
	
	// setter method
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public List<EProductEntity> getProducts() {
		return template.query("select * from eproduct", new RowMapper<EProductEntity>() {
			public EProductEntity mapRow(ResultSet rs, int row) throws SQLException {
				EProductEntity e = new EProductEntity();
				e.setID(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPrice(rs.getBigDecimal(3));
				e.setDateAdded(rs.getDate(4));
				return e;
			}
		});
	}

	public int addProduct(EProductEntity product) {
		return template.update("INSERT INTO eproduct (ID, name, price,date_added) VALUES(?,?,?,?)",
				new Object[] { product.getID(), product.getName(), product.getPrice(), product.getDateAdded() });
	}

	public EProductEntity getByName(String name) {
		EProductEntity entity = template.queryForObject("select * from eproduct where name=?",
				BeanPropertyRowMapper.newInstance(EProductEntity.class), name);
		return entity;
	}
}
