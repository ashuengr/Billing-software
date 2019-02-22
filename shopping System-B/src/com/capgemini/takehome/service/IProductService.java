package com.capgemini.takehome.service;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.exception.InvalidProductCodeException;
import com.capgemini.takehome.exception.InvalidProductQuantityException;

public interface IProductService {
public Product getProductDetails(int productCode) throws InvalidProductCodeException;
}
