package core.util;

import java.io.Serializable;

public class PurchaseCart implements Serializable{
	// transient keywords cannot be overridden
	transient String productName ;
	String productId;
	int price;
	int quantity;
	String brand;
	@Override
	public String toString() {
		return "PurchaseCart [productName=" + productName + ", productId=" + productId + ", price=" + price
				+ ", quantity=" + quantity + ", brand=" + brand + "]";
	}
	
}
