package com.capgemini.takehome.dao;
import java.util.List;

import com.capgemini.takehome.beans.Product;
public interface IProductDAO {
	Product getProductDetails(int productCode);
	List<Product> findAll();
}
