package com.capgemini.takehome.beans;

public class Product {
	int productId, productPrice;
	String productName, productCategory, productDescription;
	public Product() {
		super();
	}
	public Product(int productId, String productName, String productCategory, int productPrice) {
		super();
		this.productId = productId;
		this.productPrice = productPrice;
		this.productName = productName;
		this.productCategory = productCategory;
	}
	public Product(int productId, String productName, String productDescription, String productCategory, int productPrice) {
		super();
		this.productId = productId;
		this.productPrice = productPrice;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productDescription = productDescription;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productCategory == null) ? 0 : productCategory.hashCode());
		result = prime * result + productId;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + productPrice;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (productCategory == null) {
			if (other.productCategory != null)
				return false;
		} else if (!productCategory.equals(other.productCategory))
			return false;
		if (productId != other.productId)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productPrice != other.productPrice)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productPrice=" + productPrice + ", productName=" + productName
				+ ", productCategory=" + productCategory + "]";
	}
}

