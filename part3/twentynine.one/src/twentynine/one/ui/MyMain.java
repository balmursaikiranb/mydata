package twentynine.one.ui;


import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;



public class MyMain {
  public static void main(String args[])
	{
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
	  
	  
	/*  Map<Integer,String> myMap=new HashMap<>();
	  myMap.put(1,"one");
	  myMap.put(2,"two");
	  myMap.put(3,"three");
	  myMap.put(4,"four");
	  myMap.put(5,"five");
	  System.out.println(myMap);
	  System.out.println(myMap.keySet());
	  System.out.println(myMap.get(2));
	  System.out.println(myMap.values());
	  for (Integer keys:myMap.keySet()) {
		System.out.println("keys is:"+keys+"\nvalue is "+myMap.get(keys));
	}
	  Set myData=myMap.entrySet();
	  Iterator it=myData.iterator();
	  while(it.hasNext())
	  {
		  System.out.println(it.next());
	  }*/
	  Map<Integer,Product> myprod=new HashMap<>();
	  myprod.put(1, proOne);
	  myprod.put(2, proTwo);
	  myprod.put(3, proThree);
	for (Integer pro :myprod.keySet()) {
		System.out.println(myprod.get(pro).getProdId());
		System.out.println(myprod.get(pro).getName());
		System.out.println(myprod.get(pro).getProdPrice());
	}
	Collection<Product> mySet=myprod.values();
	List<Product> myList=new LinkedList<>(mySet);
	Collections.sort(myList);
	
	for (Product product : myList) {
		System.out.println(product.getProdId());
		System.out.println(product.getName());
		System.out.println(product.getProdPrice());
	}
	Set<Product> myset=new TreeSet<>(mySet);
	for (Product product : myset) {
		System.out.println(product.getProdId());
		System.out.println(product.getName());
		System.out.println(product.getProdPrice());
	}
	}
 

}
