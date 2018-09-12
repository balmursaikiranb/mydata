package twentyeight.four.ui;

import java.util.List;
import java.util.Scanner;

import twentyeight.four.dto.Product;
import twentyeight.four.service.IProductService;
import twentyeight.four.service.ProductService;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IProductService proservice=new ProductService();
int choice=0;
do
{
	printDetails();
	System.out.println("enter the choice:");
	Scanner sc=new Scanner(System.in);
	choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		//add
		System.out.println("Enter Product ID:");
		int pid=sc.nextInt();
		System.out.println("Enter Product Name:");
		String pname=sc.next();
		System.out.println("Enter Product Price:");
		double pprice=sc.nextDouble();
		
		Product prod=new Product();
		prod.setProdId(pid);
		prod.setName(pname);
		prod.setProdPrice(pprice);
		
		proservice.addProduct(prod);
		break;
	case 2:
		//show
		List<Product> allData=proservice.showAllData();
		for (Product all : allData) {
			System.out.println("Product ID:"+all.getProdId());
			System.out.println("Product Name:"+all.getName());
			System.out.println("Product Price:"+all.getProdPrice());
		}
		break;
	case 3:
		//search
		System.out.println("Enter Product ID:");
		int id=sc.nextInt();
		Product productsearch=proservice.searchProduct(id);
		if(productsearch!=null)
		{
			System.out.println("Product ID:"+productsearch.getProdId());
			System.out.println("Product ID:"+productsearch.getName());
			System.out.println("Product ID:"+productsearch.getProdPrice());
		}
		else
		{
			System.out.println("Product Not Found ......");
		}
		break;
	case 4:
		//remove
		System.out.println("Enter Product ID:");
		int pid1=sc.nextInt();
		proservice.removeProduct(pid1);
		break;
	case 5:
		//exit
		System.exit(0);
		break;
	default:
		//other value
		break;
	}

}while(choice!=5);
	}
public static void printDetails()
{
	System.out.println("1. Add Product ...");
	System.out.println("2. Show all Product ...");
	System.out.println("3. Search Product ...");
	System.out.println("4. Remove Product ...");
	System.out.println("5. Exit");
}
}
