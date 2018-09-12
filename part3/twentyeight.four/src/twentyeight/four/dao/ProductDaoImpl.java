package twentyeight.four.dao;

import java.util.LinkedList;
import java.util.List;

import twentyeight.four.dto.Product;

public class ProductDaoImpl implements IProductDao{
	
	List<Product> myList=new LinkedList<>();
	@Override
	public void addProductDao(Product pro) {
		// TODO Auto-generated method stub
		myList.add(pro);
	}

	@Override
	public List<Product> showAllProductDao() {
		// TODO Auto-generated method stub
		return myList;
	}

	@Override
	public Product searchProduct(int pid) {
		// TODO Auto-generated method stub
		Product psearch=null;
	for (Product product : myList) {
		if(product.getProdId()==pid)
		{
			psearch=product;
			break;
		}
	}
		return psearch;
	}

	@Override
	public void removeProduct(int prodId) {
		// TODO Auto-generated method stub
		//myList.remove(Product.prodId);
		
		for (Product product : myList) {
			if(product.getProdId()==prodId)
			{
				myList.remove(product);
				System.out.println("Product removed and its product ID is:\n"+prodId);
				break;
			}
			else
			{
				System.out.println("product id not found .....\n");
		}
			
		}
	}

}
