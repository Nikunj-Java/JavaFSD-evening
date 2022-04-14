package com.ecommerce.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ecommerce.entity.EProductEntity;

@Repository
public class EProductDAO {

        @Autowired
    private SessionFactory sessionFactory;

        @SuppressWarnings("unchecked")
        public List<EProductEntity> getAllProducts() {
                return this.sessionFactory.openSession().createQuery("from EProductEntity").list();
        }
}
