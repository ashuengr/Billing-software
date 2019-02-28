package com.capgemini.takehome.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.exception.InvalidProductCodeException;
import com.capgemini.takehome.exception.InvalidProductQuantityException;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;
import com.capgemini.takehome.util.CollectionUtil;

public class TestCase {
private static	IProductService services;
   @BeforeClass
 public static void setUpTestEnv() {
	   services=new ProductService();
   }
	@Before
	public void setUpTestData() {
	CollectionUtil.getProducts().put(1001, new Product(1001,"iphone","Electronics",35000));
	CollectionUtil.getProducts().put(1002, new Product(1002,"LEDTV","Electronics",45000));
	}
  @Test(expected=InvalidProductCodeException.class)
  public void testGetProductDetailsForInvalidProductCode()throws InvalidProductCodeException{
	  services.getProductDetails(12345);
  }
  @Test
  public void testGetProductDetailsForValidProductCode()throws InvalidProductCodeException{
	  services.getProductDetails(1002);}
  
  @Test(expected=InvalidProductCodeException.class)
  public void testValidateProductCodeForInvalidId()throws InvalidProductCodeException{
	  services.validateProductCode(234);}
	  @Test
 public void testValidateProductCodeForValidId()throws InvalidProductCodeException{
		  services.validateProductCode(1002);
  }
	  @Test(expected=InvalidProductQuantityException.class)
	  public void testValidateProductQuantityForInvalidQuantity()throws InvalidProductQuantityException{
		  services.validateProductQuantity(0);}
		  @Test
	 public void testValidateProductQuantityForValidQuantity()throws InvalidProductQuantityException{
			  services.validateProductQuantity(2);
	  }
  @After
  public void tearDownTestData()
  {
	  CollectionUtil.getProducts().clear();
  }
		  
	@AfterClass
	public static void tearDownTestEnv() {
		services=null;
	}
		  
		  
}
