package com.cg.twentynine.dto;

import java.util.Comparator;

public class Product implements Comparator<Product>{
private int prodId;
private String name;
private double prodPrice;


@Override
public String toString() {
	return "Product [prodId=" + prodId + ", name=" + name + ", prodPrice=" + prodPrice + "]";
}
public int getProdId() {
	return prodId;
}
public void setProdId(int prodId) {
	this.prodId = prodId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getProdPrice() {
	return prodPrice;
}
public void setProdPrice(double prodPrice) {
	this.prodPrice = prodPrice;
}
@Override
/*public int compareTo(Product o) {
	// TODO Auto-generated method stub
	if(this.getProdId()>o.getProdId())
		return 1;
	else if(this.getProdId()<o.getProdId())
		return -1;
	else
		return 0;
}*/
//@Override
public int compare(Product arg0, Product arg1) {
	// TODO Auto-generated method stub
	return 0;
}

}
