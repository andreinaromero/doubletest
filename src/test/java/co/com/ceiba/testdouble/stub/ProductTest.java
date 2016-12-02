package co.com.ceiba.testdouble.stub;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ProductTest {
	@Mock TaxCalculator taxCalculatorMockitoMock;
	@InjectMocks Product productSut;
	
    @Before 
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void itCalculatesTotalPrice() {
		//Arrange
		Product product = new Product(new TaxCalculatorStub(), 6000.00, "Yogurt", false);
		//Act
		Double priceToPay = product.calcPriceToPay();
		//Assert
		assertEquals("The priceToPay isn't 8000", 8000.00, priceToPay, 0.0);
	}
	
	@Test
	public void itCalculatesTotalPriceUsingMockito() {
		//Arrange
		Product product = new Product(taxCalculatorMockitoMock, 6000.00, "Yogurt", false);
		//Act
		Double priceToPay = product.calcPriceToPay();
		//Assert
		assertEquals("The priceToPay isn't 8000", 8000.00, priceToPay, 0.0);
	}
	
	
	
	

	
	
	
	
}
