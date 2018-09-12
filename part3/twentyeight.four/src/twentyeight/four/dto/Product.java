package twentyeight.four.dto;

public class Product {
private int prodId;
private String name;
private double prodPrice;
public Product()
{
	
}

public Product(int prodId, String name, double prodPrice) {
	super();
	this.prodId = prodId;
	this.name = name;
	this.prodPrice = prodPrice;
}

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
}
