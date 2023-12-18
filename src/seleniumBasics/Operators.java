package seleniumBasics;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /* int sum1=100+50;
    int sum2=sum1+250;
    int sum3=sum2+sum2;
    System.out.println(sum1);
    System.out.println(sum2);
    System.out.println(sum3);
*/
		int x=5,y=6;
		int z=x+y;
		int s=y-x;
		int m=x*y;
		int d=x/y;
		int md=x%y;
		int inc=++x;
		int dec=--x;
		System.out.println("add"+ z );
		System.out.println("sub"+ s );
		System.out.println("mul"+ m );
		System.out.println("div"+ d );
		System.out.println("mod"+ md );
		System.out.println("increment"+ inc );
		System.out.println("decrement"+ dec );
	}

}
