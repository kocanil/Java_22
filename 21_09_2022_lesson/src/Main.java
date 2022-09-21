
public class Main {

	public static void main(String[] args) {
		// oop1
		// System.out.println("hello");

		Product product1 = new Product();
		product1.setName("Delonghi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		
		
		// set value
		/*product1.name = "Delonghi Coffee Machine";
		product1.unitPrice = 7500;
		product1.discount = 7;
		product1.unitsInStock = 3;
		product1.imageUrl = "unknown.jpg";*/

		// get value
		// System.out.println(product1.name);

		Product product2 = new Product();
		/*product2.name = "Smeg Coffee Machine";
		product2.unitPrice = 6500;
		product2.discount = 8;
		product2.unitsInStock = 2;
		product2.imageUrl = "unknown2.jpg";*/
		
		product2.setName("Smeg");
		product2.setDiscount(8);
		product2.setUnitPrice(6500);
		product2.setUnitsInStock(2);
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();
		/*product3.name = "Kitchen Aid Coffee Machine";
		product3.unitPrice = 4500;
		product3.discount = 9;
		product3.unitsInStock = 4;
		product3.imageUrl = "unknown3.jpg";*/
		
		product3.setName("Kitchen Aid");
		product3.setDiscount(9);
		product3.setUnitPrice(4500);
		product3.setUnitsInStock(4);
		product3.setImageUrl("image3.jpg");
		
		Product[] products = {product1,product2,product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>"+product.getName()+"</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("0522264456");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("anil");
		individualCustomer.setLastName("koç");
		
		CorparateCustomer corporateCustomer = new CorparateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("0522264456");
		corporateCustomer.setCustomerNumber("12345");
		corporateCustomer.setCompanyName("anil");
		corporateCustomer.setTaxnumber("koç");
		
		
	}

}
