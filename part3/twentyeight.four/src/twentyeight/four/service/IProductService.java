package twentyeight.four.service;

import java.util.List;

import twentyeight.four.dto.Product;

public interface IProductService {

	public void addProduct(Product pro);
	public List<Product> showAllData();
	public Product searchProduct(int prodid);
	public void removeProduct(int proid);
}
