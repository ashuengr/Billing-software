package com.capgemini.takehome.dao;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.takehome.beans.Product;
import com.capgemini.takehome.util.CollectionUtil;
public class ProductDAO implements IProductDAO{
	@Override
	public Product getProductDetails(int productCode) {
		return CollectionUtil.products.get(productCode);
	}
	@Override
	public List<Product> findAll() {
		ArrayList<Product> productList = new ArrayList<Product>(CollectionUtil.products.values());
		return null;
	}
}
