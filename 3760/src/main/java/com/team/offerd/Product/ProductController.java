package com.team.offerd.Product;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(method=RequestMethod.POST, value="/create")
	public void addProduct(@RequestBody Product product) {
		this.productService.createProduct(product);;
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/update")
	public void updateProduct(@RequestBody Product product) {
		this.productService.updateProduct(product);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public void updateProduct(@PathVariable ("id") long id) {
		this.productService.deleteProduct(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	Product getProductById(@PathVariable ("id") long id) {
		return this.productService.readProduct(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/all")
	Iterable<Product> getAllProducts() {
		return this.productService.getAllProducts();
	}
	
}

