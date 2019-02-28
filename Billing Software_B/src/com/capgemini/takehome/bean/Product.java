package com.capgemini.takehome.bean;

public class Product {
int productId;
String prouctName;
String productCategory;
String productDescription;
float productPrice;
float lineTotal;
public Product(int productId, String prouctName, String productCategory, String productDescription, float prouctPrice,
		float lineTotal) {
	super();
	this.productId = productId;
	this.prouctName = prouctName;
	this.productCategory = productCategory;
	this.productDescription = productDescription;
	this.productPrice = productPrice;
	this.lineTotal = lineTotal;
}
public Product() {
	super();
}

public Product(int productId, String prouctName, String productCategory, float prouctPrice) {
	super();
	this.productId = productId;
	this.prouctName = prouctName;
	this.productCategory = productCategory;
	this.productPrice = prouctPrice;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProuctName() {
	return prouctName;
}
public void setProuctName(String prouctName) {
	this.prouctName = prouctName;
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
public float getProductPrice() {
	return productPrice;
}
public void setProductPrice(float prouctPrice) {
	this.productPrice = prouctPrice;
}
public float getLineTotal() {
	return lineTotal;
}
public void setLineTotal(float lineTotal) {
	this.lineTotal = lineTotal;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + Float.floatToIntBits(lineTotal);
	result = prime * result + ((productCategory == null) ? 0 : productCategory.hashCode());
	result = prime * result + ((productDescription == null) ? 0 : productDescription.hashCode());
	result = prime * result + productId;
	result = prime * result + ((prouctName == null) ? 0 : prouctName.hashCode());
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
	if (Float.floatToIntBits(lineTotal) != Float.floatToIntBits(other.lineTotal))
		return false;
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
	if (prouctName == null) {
		if (other.prouctName != null)
			return false;
	} else if (!prouctName.equals(other.prouctName))
		return false;
	if (Float.floatToIntBits(productPrice) != Float.floatToIntBits(other.productPrice))
		return false;
	return true;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", prouctName=" + prouctName + ", productCategory=" + productCategory
			+ ", productDescription=" + productDescription + ", prouctPrice=" + productPrice + ", lineTotal=" + lineTotal
			+ "]";
}

}
