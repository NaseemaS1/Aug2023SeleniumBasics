package seleniumBasics;

public class IFelseEX3 {
	public static void main(String[] args) {
		
		int age=20;
		int weight=80;
	/*	if(age>=18)
		{
			if(weight>=50) {
				System.out.println("you are eligible to donate blood");
			}
		}*/
		
		int age1=25;
		int weight1=48;
		if(age>=18)
		{
			if(weight>=50)
			{
				System.out.println("you are eligible to donate blood");
			}
			else
			{
				System.out.println("you are not eligible to donate blood");
			}
		}
		else
		{
			System.out.println("age must be greater than 25");
		}
	}

}
