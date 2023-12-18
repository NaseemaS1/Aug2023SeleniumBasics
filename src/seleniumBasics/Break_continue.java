package seleniumBasics;

public class Break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			if(i==6)
			{
				break;
			}
		}*/
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=5;j++)
			{
				if(j==4)
					
				{
					continue;
				}
				
		System.out.println(j);
			}
		}

	}

}
