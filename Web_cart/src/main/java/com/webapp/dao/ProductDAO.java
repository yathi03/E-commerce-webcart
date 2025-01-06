package com.webapp.dao;

import java.util.List;

import com.webapp.dto.ProductDTO;

public interface ProductDAO {
	boolean addProduct(ProductDTO product);
    List<ProductDTO> getAllProducts();


}
