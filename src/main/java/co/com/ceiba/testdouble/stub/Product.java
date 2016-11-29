package co.com.ceiba.testdouble.stub;


public class Product {
	private Double price;
	private TaxCalculator taxCalculator;
	private boolean isSold;
	
	public Product(TaxCalculator aTaxCalculator, double aPrice, String aName, Boolean sold) {
		this.taxCalculator = aTaxCalculator;
		this.price = aPrice;
		this.isSold = sold;
	}
	public Double calcPriceToPay() {
        return getPrice() + taxCalculator.getTax();
    }
	public Double getPrice() {
		return price;
	}
	public boolean isSold() {
		// TODO Auto-generated method stub
		return this.isSold;
	}

	
	
	
}





