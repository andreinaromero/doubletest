package co.com.ceiba.testdouble.fake;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductsInStockTest {

	@Test
	public void itCalculatesCostSoldProducts() {
		//Arrange
		ProductsInStock stock = new ProductsInStock(new ProductFakeRepository());
		//Act
		Double costSoldProducts = stock.calculateCostSoldProducts();
		//Assert
		assertEquals("The costSoldProducts isn't 140000", 140000.00, costSoldProducts, 0.0);
	}

	
	
	
}
