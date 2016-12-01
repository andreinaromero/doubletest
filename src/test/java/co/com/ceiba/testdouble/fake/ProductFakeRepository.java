package co.com.ceiba.testdouble.fake;

import java.util.ArrayList;
import java.util.List;

import co.com.ceiba.testdouble.stub.Product;
import co.com.ceiba.testdouble.stub.TaxCalculatorStub;

public class ProductFakeRepository implements ProductRepository {
	

	List<Product> productsInMemory = new ArrayList<Product>();

	@Override
	public List<Product> findSaledProducts() {
		List<Product> saledProducts = new ArrayList<Product>();
		for (Product product: this.productsInMemory) {
			if (product.isSold()) {
				saledProducts.add(product);
			}
		}
		return saledProducts;
	}

	
	public ProductFakeRepository() {
		productsInMemory
				.add(new Product(new TaxCalculatorStub(), 14000.00, "Guacamole", ISSOLD));
		productsInMemory.add(
				new Product(new TaxCalculatorStub(), 55000.00, "Galleta Soda", ISSOLD));
		productsInMemory.add(
				new Product(new TaxCalculatorStub(), 71000.00, "Jugo", ISSOLD));
		productsInMemory.add(
				new Product(new TaxCalculatorStub(), 850000.00, "Chocolate", ISNOTSSOLD));		
	}
	
	private static final boolean ISSOLD = true;
	private static final boolean ISNOTSSOLD = false;

}
