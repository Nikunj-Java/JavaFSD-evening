package com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.dao.EProductDAO;
import com.ecommerce.entity.EProductEntity;

@Service
public class EProductService {

	@Autowired
	EProductDAO eproductDAO;
	public List<EProductEntity> getAllProducts() {
		return eproductDAO.getAllProducts();
	}

	
}
