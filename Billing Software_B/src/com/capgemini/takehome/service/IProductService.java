package com.capgemini.takehome.service;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.exception.InvalidProductCodeException;
import com.capgemini.takehome.exception.InvalidProductQuantityException;

public interface IProductService {
public Product getProductDetails(int productCode) throws InvalidProductCodeException;
public boolean validateProductCode(int productCode)throws InvalidProductCodeException;
public boolean validateProductQuantity(int qty)throws InvalidProductQuantityException;
public float lineTotal(int productCode,int qty) throws InvalidProductCodeException;
public void display(int productCode,int productQuantity) throws InvalidProductCodeException;
}