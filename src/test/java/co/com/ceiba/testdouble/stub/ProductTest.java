
package co.com.ceiba.testdouble.stub;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ProductTest {
	@Mock
	private TaxCalculator taxCalculatorMockitoMock;
	private Product productSut;

	@Before
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void itCalculatesTotalPrice() {
		// Arrange
		productSut = new Product(new TaxCalculatorStub(), 6000.00, "Yogurt", false);
		// Act
		Double priceToPay = productSut.calcPriceToPay();
		// Assert
		assertEquals("The priceToPay isn't 8000", 8000.00, priceToPay, 0.0);
	}

	@Test
	public void itCalculatesTotalPriceUsingMockito() {
		// Arrange
		productSut = new Product(taxCalculatorMockitoMock, 6000.00, "Yogurt", false);
		when(taxCalculatorMockitoMock.getTax()).thenReturn(2000d);
		// Act
		Double priceToPay = productSut.calcPriceToPay();
		// Assert
		assertEquals("The priceToPay isn't 8000", 8000.00, priceToPay, 0.0);
	}

}
