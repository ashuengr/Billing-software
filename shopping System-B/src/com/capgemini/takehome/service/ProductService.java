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
    Product product=new Product();
    product=obj.getProductDetails(productCode);
    if(product==null)
     throw new InvalidProductCodeException("Sorry!The product code is not available");
    else
    	return product;
	}
public boolean validateProductCode(int productCode)throws InvalidProductCodeException
{
	if(productCode >999 && productCode<10000)
		return false;
	else
		return true;
}
public boolean validateProductQuantity(int productQuantity)throws InvalidProductQuantityException
{
	if(productQuantity<=0)
		throw new InvalidProductQuantityException("Quantity should not less than or equal to zero");
	else
		return false;
	}
public int calculateTotalBill(int productCode,int productQuantity)throws InvalidProductQuantityException,InvalidProductCodeException{
	int totalBill=0;
	if(productCode<=0)
		throw new InvalidProductCodeException("Sorry!The product code is not available");
	else
	{
		if(productQuantity<=0)
			throw new InvalidProductQuantityException("Quantity should not less than or equal to zero");
		else
		{
			System.out.println("Product Name:"+product.getProductName());
		}
	}
}
}
