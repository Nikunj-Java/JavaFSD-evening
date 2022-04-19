package com.simplilearn.demo;

import java.math.BigDecimal;
import java.util.Date;

public class EProductEntity {

        private long ID;
        private String name;
        private BigDecimal price;
        private Date dateAdded;  
        
        public long getID() {return this.ID; }
        public String getName() { return this.name;}
        public BigDecimal getPrice() { return this.price;}
        public Date getDateAdded() { return this.dateAdded;}
        
        public void setID(long id) { this.ID = id;}
        public void setName(String name) { this.name = name;}
        public void setPrice(BigDecimal price) { this.price = price;}
        public void setDateAdded(Date date) { this.dateAdded = date;}   
}
