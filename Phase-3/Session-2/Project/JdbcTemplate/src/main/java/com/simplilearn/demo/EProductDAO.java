package com.simplilearn.demo;
import java.sql.ResultSet;    

import java.sql.SQLException;    
import java.util.List;    
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;     

public class EProductDAO {

        JdbcTemplate template;    
        
        
        //setter method
        public void setTemplate(JdbcTemplate template) {    
            this.template = template;    
        }    
        
        public List<EProductEntity> getProducts(){    
            return template.query("select * from eproduct",new RowMapper<EProductEntity>(){    
                public EProductEntity mapRow(ResultSet rs, int row) throws SQLException {    
                        EProductEntity e=new EProductEntity();    
                    e.setID(rs.getInt(1));    
                    e.setName(rs.getString(2));    
                    e.setPrice(rs.getBigDecimal(3));    
                    e.setDateAdded(rs.getDate(4));    
                    return e;    
                }    
            });    
        }  
        
        public int addProduct(EProductEntity product)
        {
        	return template.update("INSERT INTO eproduct (ID, name, price,dateAdded) VALUES(?,?,?,?)",
        	        new Object[] { product.getID(),product.getName(),product.getPrice(),product.getDateAdded()});
        }
        
        
}
