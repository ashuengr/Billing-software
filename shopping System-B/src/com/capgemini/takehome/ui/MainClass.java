package com.capgemini.takehome.ui;

import java.util.Scanner;

import com.capgemini.takehome.exception.InvalidProductCodeException;
import com.capgemini.takehome.exception.InvalidProductQuantityException;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;

public class MainClass {
public static void main(String ar[])
{
 IProductService obj=new ProductService();	
 Scanner sc=new Scanner(System.in);
 boolean flag=true;
 int choice=0;
 while(flag=true)
 {
	System.out.println("services");
	System.out.println("1.Enter product code and quantity/n2.Exit");
	System.out.println("Enter your choice ");
	choice=sc.nextInt(); 
	switch(choice) {
	case 1:System.out.println("Enter product code");
	       int prodId=sc.nextInt();
	       try {obj.validateProductCode(prodId);
	}catch(InvalidProductCodeException e) {
		System.out.println(e.getMessage());
	}
	        System.out.println("Enter product quantity");
	       int quantity=sc.nextInt();
	       try {
	    	   obj.validateProductQuantity(quantity);
	       }catch(InvalidProductQuantityException e)
	       {
	    	   System.out.println(e.getMessage());
	       }
	       try {
			obj.display(prodId, quantity);
		} catch (InvalidProductCodeException e) {
			e.printStackTrace();
		}
	       
	       break;
	case 2:	System.out.println("exiting from billing software application");
	        System.exit(0);
    default:System.out.println("Please choose a valid option");
            break;
}	

 }
}
}
