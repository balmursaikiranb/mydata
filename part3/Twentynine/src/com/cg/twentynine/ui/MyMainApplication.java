package com.cg.twentynine.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.cg.twentynine.dto.Product;

public class MyMainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product proOne=new Product();
proOne.setProdId(1002);
proOne.setName("LG");
proOne.setProdPrice(7777);

Product proTwo=new Product();
proTwo.setProdId(1001);
proTwo.setName("IPhone");
proTwo.setProdPrice(50000);

Product proThree=new Product();
proThree.setProdId(1003);
proThree.setName("Nokia 5");
proThree.setProdPrice(13000);

List<Product> myList=new LinkedList<>();
myList.add(proOne);
myList.add(proTwo);
myList.add(proThree);
Collections.sort(myList);

List<Product> myList1=new ArrayList<>();
myList1.add(proOne);
myList1.add(proTwo);
myList1.add(proThree);

for (Product product : myList) {
	System.out.println("Product ID is:"+product.getProdId());
	System.out.println("Product Name is:"+product.getName());
	System.out.println("Product Price is:"+product.getProdPrice()+"\n\n");
}


for (Product product : myList1) {
	System.out.println("Product ID is:"+product.getProdId());
	System.out.println("Product Name is:"+product.getName());
	System.out.println("Product Price is:"+product.getProdPrice());
}





	}

}
