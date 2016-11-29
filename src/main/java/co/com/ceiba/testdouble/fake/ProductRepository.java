package co.com.ceiba.testdouble.fake;

import java.util.List;

import co.com.ceiba.testdouble.stub.Product;

public interface ProductRepository {

	List<Product> findSaledProducts();

}
