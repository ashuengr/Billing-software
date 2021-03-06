package com.capgemini.takehome.bean;

public class Product {
int productId;
String productName;
String productCategory;
float productPrice;
String productDescription;
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
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
public float getProductPrice() {
	return productPrice;
}
public void setProductPrice(float productPrice) {
	this.productPrice = productPrice;
}
public String getProductDescription() {
	return productDescription;
}
public void setProductDescription(String productDescription) {
	this.productDescription = productDescription;
}
public Product(int productId, String productName, String productCategory, float productPrice,
		String productDescription) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productCategory = productCategory;
	this.productPrice = productPrice;
	this.productDescription = productDescription;
}
public Product() {
	super();
}

public Product(int productId, String productName, String productCategory, float productPrice) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productCategory = productCategory;
	this.productPrice = productPrice;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((productCategory == null) ? 0 : productCategory.hashCode());
	result = prime * result + ((productDescription == null) ? 0 : productDescription.hashCode());
	result = prime * result + productId;
	result = prime * result + ((productName == null) ? 0 : productName.hashCode());
	result = prime * result + Float.floatToIntBits(productPrice);
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
	if (productDescription == null) {
		if (other.productDescription != null)
			return false;
	} else if (!productDescription.equals(other.productDescription))
		return false;
	if (productId != other.productId)
		return false;
	if (productName == null) {
		if (other.productName != null)
			return false;
	} else if (!productName.equals(other.productName))
		return false;
	if (Float.floatToIntBits(productPrice) != Float.floatToIntBits(other.productPrice))
		return false;
	return true;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", productCategory=" + productCategory
			+ ", productPrice=" + productPrice + ", productDescription=" + productDescription + "]";
}

}
