package co.com.ceiba.testdouble.fake;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductsInStockTest {

	@Test
	public void itCalculatesCostSaledProducts() {
		//Arrange
		ProductsInStock stock = new ProductsInStock(new ProductFakeRepository());
		//Act
		Double costSaledProducts = stock.calculateCostSaledProducts();
		//Assert
		assertEquals("The costSaledProducts isn't 140000", 140000.00, costSaledProducts, 0.0);
	}

}
