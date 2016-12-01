package co.com.ceiba.testdouble.fake;

import co.com.ceiba.testdouble.stub.Product;

public class ProductsInStock {

	private ProductRepository productRepository;

	public ProductsInStock(ProductRepository aProductRepository) {
		this.productRepository = aProductRepository;
	}

	public Double calculateCostSaledProducts() {
		Double costSaledProducts = 0.0;
		for (Product product : productRepository.findSaledProducts()) {
			costSaledProducts += product.getPrice();
		}
		return costSaledProducts;
	}
	
	

}
