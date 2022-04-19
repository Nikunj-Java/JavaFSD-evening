package com.simplilearn;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
 

public class EProductDao {
	
	
	JdbcTemplate template;
	
	 
	
	///setter method
	public void setTemplate(JdbcTemplate template) {
		this.template=template;
	}
	
	public List<ProductEntity> getProducts(){
		
		return template.query("select * from eproduct", new RowMapper<ProductEntity>() {
			public ProductEntity mapRow(ResultSet rs,int row) throws SQLException{
				
				ProductEntity p= new ProductEntity();
				p.setID(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPrice(rs.getBigDecimal(3));
				p.setDateAdded(rs.getDate(4));
				
				return p;				
			}
		});
	}
	
	

}
