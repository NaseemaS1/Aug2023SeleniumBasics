package BuilderPattern;

public class ShoppingTest {

	public static void main(String[] args) {

		Ecommerce u1 = new Ecommerce();
	
	   u1.login("Karishma@gmail.com", "Karishma123")
	       .search("Laptop")
	         .selectProduct("Macbook")
	          .addToCart("MacBook")
	           .doPayment("1234 1234 4567 7777", 422)
	             .generateOrderId()
	              .logout();
	   
	   u1.login("Karishma@gmail.com", "Karishma123")
	     .search("shoes", "red")
	      .selectProduct("Nike Airmax")
	        .logout();
	   
	   u1.login("Karishma@gmail.com", "Karishma123")
	        .search("Mobile", "black")
	          .selectProduct("Iphone 15")
	            .addToCart("Iphone15")
	              .logout();
	   u1.login("karishma@gmail.com", "karishma123")
		.logout();
	
	
	u1.login("karishma@gmail.com", "karishma123");
	
	//
	u1.login()
	.search("Mobile", "Black")
	.selectProduct("Iphone 15")
		.addToCart("Iphone 15")
		.doPayment("1234 1234 4567 7777", 422)
		.generateOrderId()
			.logout()
			.login("karishma@gmail.com", "karishma123")
			.search("Laptop")
				.selectProduct("MAcbook")
					.addToCart("MAcbook")
						.doPayment("1234 1234 4567 7777", 422)
							.generateOrderId()
								.logout();
	
	
	
	}
	

}
