package com.team.offerd.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public void createProduct(Product product) {
		productRepository.save(product);
	}
	
	public Product readProduct(long id) {
		return productRepository.findOne(id);
	}
	
	public void updateProduct(Product product) {
		productRepository.save(product);
	}
	
	public void deleteProduct(long id) {
		productRepository.delete(id);
	}
	
	public Iterable<Product> getAllProducts(){
		return productRepository.findAll();
	}
}
