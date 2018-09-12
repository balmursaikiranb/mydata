package com.cg.demoeight.ui;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class MyMainApplication {
 
	public static void main(String args[])
	{
		//List<String> myList=new ArrayList<>();
		/*List  myList=new ArrayList();*/
		List<String> myList=new LinkedList<>();
		myList.add("sai");
		myList.add("kiran");
		myList.add("balmur");
		myList.add("sai");
		myList.remove(3);
		myList.remove("sai");
		//myList.removeAll(myList);
		System.out.println(myList.get(1));
		System.out.println(myList.size());
		/*System.out.println(myList);*/
		/*for (String str:myList) {
			System.out.println(str);
		}*/
		/*for (Object str:myList) {
			System.out.println(str);
		}*/
		Iterator iterator=myList.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			
		}
	}
}
