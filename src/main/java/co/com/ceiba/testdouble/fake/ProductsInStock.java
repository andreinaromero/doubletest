package co.com.ceiba.testdouble.fake;

import co.com.ceiba.testdouble.stub.Product;

public class ProductsInStock {

	private ProductRepository productRepository;

	public ProductsInStock(ProductRepository aProductRepository) {
		this.productRepository = aProductRepository;
	}

	public Double calculateCostSoldProducts() {
		Double costSoldProducts = 0.0;
		for (Product product : productRepository.findSoldProducts()) {
			costSoldProducts += product.getPrice();
		}
		return costSoldProducts;
	}
	
	

	
	
	
}
