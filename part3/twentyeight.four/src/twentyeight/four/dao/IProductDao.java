package twentyeight.four.dao;

import java.util.List;

import twentyeight.four.dto.Product;

public interface IProductDao {

	public void addProductDao(Product pro);
	public List<Product> showAllProductDao();
	public Product searchProduct(int pid);
	public void removeProduct(int prodId);
}
