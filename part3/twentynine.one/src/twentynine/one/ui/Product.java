package twentynine.one.ui;


import java.util.Map;

public class Product implements Comparable<Product>{
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
	
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		if(this.getProdId()>o.getProdId())
		{
			return 1;
		}
		else if(this.getProdId()<o.getProdId())
			return -1;
		else
			return 0;
	}
	
     
     }
	
	
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
	


