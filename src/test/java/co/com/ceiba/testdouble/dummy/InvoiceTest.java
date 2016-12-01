package co.com.ceiba.testdouble.dummy;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import co.com.ceiba.testdouble.stub.Product;

public class InvoiceTest {

	@Test
	public void itCalculatesBillingAmount() {
		//Arrange
	    List<Product> products = createProductsToBuy();
	    Invoice inv = new Invoice( new DummyCustomer() );
	    // Act
	    Double billAmount = inv.calculate(products);
	    // Assert
	    assertEquals("total de la factura", billAmount, 20000, 0.0);
	}

	
	
	private List<Product> createProductsToBuy() {
		// TODO Auto-generated method stub
		return null;
	}

}
