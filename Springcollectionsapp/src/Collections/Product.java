package Collections;

import java.io.Serializable;
import java.util.Map;

public class Product implements Serializable{
	Map<Integer,String> productvalues;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Map<Integer, String> productvalues) {
		super();
		this.productvalues = productvalues;
	}

	public Map<Integer, String> getProductvalues() {
		return productvalues;
	}

	public void setProductvalues(Map<Integer, String> productvalues) {
		this.productvalues = productvalues;
	}

	@Override
	public String toString() {
		return "Product [productvalues=" + productvalues + "]";
	}
	

}

