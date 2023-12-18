package OOPS_Abstract;

public abstract class Page {
	
	
	public Page(){
		System.out.println("Page const...");
	}
	
	public Page(int a){
		
		System.out.println("Page const..." + a);
	}


	public abstract void title();
	public abstract void url();
	
	public void pageLoadTime() {
		
		System.out.println("page Load time out=10secs");
		
	}
	
	public final void logo() {
		
		System.out.println("App Logo");
		
	}

}
