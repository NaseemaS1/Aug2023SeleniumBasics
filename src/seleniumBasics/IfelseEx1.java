package seleniumBasics;

public class IfelseEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Number=13;
		if(Number%2==0) {
			System.out.println("even mumber");
		}
		else {
			System.out.println("odd number");
		}
		
		//Leap year
		
		int Year=2020;
		if((Year%4==0)&&(Year%100!=0)||(Year%400==0))
		{
			System.out.println("leap year");
			
		}
		else {
			System.out.println("common year");
		}
		
		String output=(Number%2==0)?"even number":"odd number";
		System.out.println(output);
	}

}
