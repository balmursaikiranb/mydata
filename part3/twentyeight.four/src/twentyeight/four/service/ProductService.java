package twentyeight.four.service;

import java.util.List;

import twentyeight.four.dao.IProductDao;
import twentyeight.four.dao.ProductDaoImpl;
import twentyeight.four.dto.Product;

public class ProductService implements IProductService{
IProductDao dao=new ProductDaoImpl();
	@Override
	public void addProduct(Product pro) {
		// TODO Auto-generated method stub
		dao.addProductDao(pro);
	}

	@Override
	public List<Product> showAllData() {
		// TODO Auto-generated method stub
		return dao.showAllProductDao();
	}

	@Override
	public Product searchProduct(int prodid) {
		// TODO Auto-generated method stub
		return dao.searchProduct(prodid);
	}

	@Override
	public void removeProduct(int proid) {
		// TODO Auto-generated method stub
		dao.removeProduct(proid);
	}

}
