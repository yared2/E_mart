package edu.miu.e_mart.service.definition;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.miu.e_mart.domain.Product;
import edu.miu.e_mart.domain.Review;

@Service
public interface IProductService {
	public Product saveProduct(Product product);
	public List<Product> findAllProducts();
	public Product findProductById(Integer productId);
	public void deleteProductById(Integer productId);
	
	//public List<Product> findAllProductsByCategory(String category);
	public String identifyUser(String user) throws Exception;
	//public List<Review> findAllCommentsOfProduct(Integer productId);

}
