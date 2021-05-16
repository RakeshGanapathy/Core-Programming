package core.io.file;

public class SerializationImplementor {

	public static void main(String[] args) {
		PurchaseCart pc = new PurchaseCart();
		pc.brand = "apple";
		pc.price = 123344;
		pc.quantity = 10;
		pc.productId = "Iph029";
		pc.productName = "Iphone X";
		FileUtility.serializeObjectToFile(pc,"H:\\pc.ser");
		FileUtility.deserializeObjectFromFile("H:\\pc.ser");
	}

	
}
