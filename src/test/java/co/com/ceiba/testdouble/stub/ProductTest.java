package co.com.ceiba.testdouble.stub;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductTest {

	@Test
	public void itCalculatesTotalPrice() {
		//Arrange
		Product product = new Product(new TaxCalculatorStub(), 6000.00);
		//Act
		Double priceToPay = product.calcPriceToPay();
		//Assert
		assertEquals("The priceToPay isn't 8000", 8000.00, priceToPay, 0.0);
	}
	
	

	
	
	
	
}
