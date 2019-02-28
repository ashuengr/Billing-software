package com.capgemini.takehome.service;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.dao.IProductDAO;
import com.capgemini.takehome.dao.ProductDAO;
import com.capgemini.takehome.exception.InvalidProductCodeException;
import com.capgemini.takehome.exception.InvalidProductQuantityException;

public class ProductService implements IProductService{
    IProductDAO obj=new ProductDAO();
    Product product=new Product();

	@Override
	public Product getProductDetails(int productCode) throws InvalidProductCodeException {
    product=obj.getProductDetails(productCode);
    if(product==null)
     throw new InvalidProductCodeException("Sorry!The product code is not available");
    else
    	return product;
	}
	@Override
public boolean validateProductCode(int productCode)throws InvalidProductCodeException
{
	if(productCode >999 && productCode<10000)
		return true;
	else
		throw new InvalidProductCodeException("Sorry!The product code is not available");

}
	@Override
public boolean validateProductQuantity(int productQuantity)throws InvalidProductQuantityException
{
	if(productQuantity<=0)
		throw new InvalidProductQuantityException("Quantity should not less than or equal to zero");
	else
		return true;
	}
	@Override
public float lineTotal(int productCode,int productQuantity) throws InvalidProductCodeException{
			product=getProductDetails( productCode);
			float totalPrice=product.getProductPrice()*productQuantity;
	       return totalPrice; 
}
	@Override
public void display(int productCode,int productQuantity) throws InvalidProductCodeException{
		    product=getProductDetails( productCode);
			System.out.println("Product Name:"+product.getProuctName());
			System.out.println("Product Category : "+ product.getProductCategory());
			System.out.println("Product Price (Rs) : "+ product.getProductPrice());
			System.out.println("Product Quantity : "+ productQuantity);
			System.out.println("Total price"+lineTotal( productCode, productQuantity));
		}
	

}