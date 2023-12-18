package BuilderPattern;

public class Ecommerce {

	public Ecommerce login() {
		System.out.println("User is logged in");
		return this;
		}
	public Ecommerce login(String un,String pwd) {
		System.out.println("User is logged with:"+un+" "+pwd);
		return this;
	}
	public Ecommerce search(String productName) {
		System.out.println("Searching product:"+productName);
		return this;
	}
	public Ecommerce search(String productName,String color) {
		System.out.println("Searching product:"+productName+" "+color);
		return this;
	}
	public Ecommerce selectProduct(String productName) {
		System.out.println("Selecting product:"+productName);
		return this;
	}

    public Ecommerce addToCart(String productName) {
	System.out.println("adding product to the cart:"+productName);
	return this;
     }
	public Ecommerce doPayment(String cc,int cvv) {
		System.out.println("adding product to the cart:"+cc+" : "+cvv);
		return this;
	}
	public Ecommerce generateOrderId() {
		System.out.println("order id is:"+12345);
		return this;
	}
	public Ecommerce logout() {
		System.out.println("logout");
		return this;
	}
		
	
}
