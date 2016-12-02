package co.com.ceiba.testdouble.spy;

import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.Before;

public class AgesListTest {

	@Spy
	private AgesList agesListSut;
	
	@Before
	public void initMocks(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testCountNumbersSpy(){
		//Arrange
		agesListSut = new AgesListSpy();
		//Act - Calling real methods! 
		agesListSut.addNumber(1);
		agesListSut.addNumber(2);
		agesListSut.addNumber(3);
		//Assert
		assertEquals("Odd numbers count not 1", 1, agesListSut.countOdd());
		assertEquals("Even numbers count not 100", 100, agesListSut.countEven());
	}
	
	@Test
	public void testCountNumbersMockitoSpy(){
		//Arrange
		when(agesListSut.countEven()).thenReturn(100);
		//Act
		agesListSut.addNumber(1);
		agesListSut.addNumber(2);
		agesListSut.addNumber(3);
		//Assert
		assertEquals("Odd numbers count not 1", 1, agesListSut.countOdd());
		assertEquals("Even numbers count not 100", 100, agesListSut.countEven());
	}
}
