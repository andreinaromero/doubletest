package co.com.ceiba.testdouble.stub;


public class Product {
	private Double price;
	private TaxCalculator taxCalculator;
	public Product(TaxCalculator aTaxCalculator, double aPrice) {
		this.taxCalculator = aTaxCalculator;
		this.price = aPrice;
	}
	public Double calcPriceToPay() {
        return getPrice() + taxCalculator.getTax();
    }
	public Double getPrice() {
		return price;
	}

	
	
	
}





