package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		String url=null;
		if(url==null) {
			try {
				throw new Exception("url is null");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("enter url in the browser");
		}
	}

}
