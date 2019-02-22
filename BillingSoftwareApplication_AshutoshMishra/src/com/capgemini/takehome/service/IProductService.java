package com.capgemini.takehome.service;
import com.capgemini.takehome.beans.Product;
import com.capgemini.takehome.exceptions.BillingSoftwareApplicationDownException;
import com.capgemini.takehome.exceptions.InvalidProductCodeException;
import com.capgemini.takehome.exceptions.InvalidProductQuantityException;
import com.capgemini.takehome.exceptions.ProductDetailsNotFoundException;
public interface IProductService {
	Product getProductDetails(int productCode) throws ProductDetailsNotFoundException, BillingSoftwareApplicationDownException, InvalidProductCodeException;
	int calculateTotalBill(int productCode, int quantity) throws ProductDetailsNotFoundException, InvalidProductCodeException, InvalidProductQuantityException, BillingSoftwareApplicationDownException;
	void displayBill(int productCode, int quantity)throws ProductDetailsNotFoundException, InvalidProductCodeException, InvalidProductQuantityException, BillingSoftwareApplicationDownException;
}
