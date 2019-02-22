package com.capgemini.takehome.service;
import com.capgemini.takehome.beans.Product;
import com.capgemini.takehome.dao.IProductDAO;
import com.capgemini.takehome.dao.ProductDAO;
import com.capgemini.takehome.exceptions.BillingSoftwareApplicationDownException;
import com.capgemini.takehome.exceptions.InvalidProductCodeException;
import com.capgemini.takehome.exceptions.InvalidProductQuantityException;
import com.capgemini.takehome.exceptions.ProductDetailsNotFoundException;
public class ProductService implements IProductService{
	IProductDAO productDao = new ProductDAO();
	@Override
	public Product getProductDetails(int productCode)  throws ProductDetailsNotFoundException, InvalidProductCodeException, BillingSoftwareApplicationDownException{
		Product product = new Product();
		if(productCode<=0) {
			throw new InvalidProductCodeException("Sorry! The Product Code "+ productCode+" is not available. ");
		}
		else {
			product = productDao.getProductDetails(productCode);
			if(product==null) {
				throw new ProductDetailsNotFoundException();
			}
		}
		return product;
	}
	@Override
	public int calculateTotalBill(int productCode, int quantity) throws ProductDetailsNotFoundException, InvalidProductCodeException, InvalidProductQuantityException, BillingSoftwareApplicationDownException{
		int totalBill = 0;
		if(productCode<=0) {
			throw new InvalidProductCodeException("Sorry! The Product Code "+ productCode+" is not available. ");
		}
		else {
			Product product = getProductDetails(productCode);
			if(quantity<0) {
				throw new InvalidProductQuantityException("Product Details Not Found for ProductCode: "+productCode);
			}
			else {
				totalBill = product.getProductPrice()*quantity;
			}
		}
		return totalBill;
	}
	@Override
	public void displayBill(int productCode, int quantity) throws ProductDetailsNotFoundException, InvalidProductCodeException, InvalidProductQuantityException, BillingSoftwareApplicationDownException{
		if(productCode<=0) {
			throw new InvalidProductCodeException("Wrong Product Code.");
		}
		else {
			Product product = getProductDetails(productCode);
			if(quantity<0) {
				throw new InvalidProductQuantityException("Product Details Not Found for Product Code: "+productCode);
			}
			else {
				System.out.println("Product Name : "+ product.getProductName());
				System.out.println("Product Category : "+ product.getProductCategory());
				System.out.println("Product Description : "+ product.getProductDescription());
				System.out.println("Product Price (Rs) : "+ product.getProductPrice());
				System.out.println("Product Quantity : "+ quantity);
				System.out.println("Line Total (Rs) : "+ calculateTotalBill(productCode, quantity));
			}
		}
	}
}