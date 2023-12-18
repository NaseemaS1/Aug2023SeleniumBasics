package seleniumBasics;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String[] cars= {"volvo","BMW","fORD","Mazda"};
		int[] myNUM= {10,20,30,40};
	//	cars[0]="Opera";
		
		for(int i=0;i<=cars.length;i++)
		{
			System.out.println(cars[i]);
		}
		for(String i: cars)
		{
		System.out.println(i);
		}
	}

}
