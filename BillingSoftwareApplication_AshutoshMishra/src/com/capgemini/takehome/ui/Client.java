package com.capgemini.takehome.ui;
import java.util.Scanner;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;
public class Client {
	public static void main(String[] args) {
		IProductService services = new ProductService();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int choice = 0;
		while(flag=true) {
			
			System.out.println("SERVICES : ");
			System.out.println("1: Generate Bill by Enetering Product Code and Quantity  \t \t 2:Exit");
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1: System.out.println("Enter Product Code: ");
			int productCode = sc.nextInt();
			System.out.println("Enter Quantity: ");
			int quantity = sc.nextInt();
			services.displayBill(productCode, quantity);
			break;
			case 2: System.out.println("Exiting BILLING SOFTWARE APPLICATION.");
			flag = false;
			break;
			default : System.out.println("Sorry You Choose A Invalid Option. Try Again With Valid Options.");
			}
		}
	}
}
