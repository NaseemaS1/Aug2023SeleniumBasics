package seleniumTraining;

public class IncreementDecrementPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	int i=11;
	//	i=i++ + ++i;
	//	System.out.println(i);
		
	//	int a=11,b=22,c;
		
	//	c = a + b + a++ + b++ + ++a + ++b;
	//	System.out.println("a=" +a);
	//	System.out.println("b=" +b);
	//	System.out.println("c=" +c);
		
		//int j=0;
		//int k = j++ - --j + ++j - j--;
		//System.out.println(k);

	//	int i=19,j=29,k=0;
	//	int m = i-- - j-- - k--;
	//	System.out.println("i="+i);
	//	System.out.println("j="+j);
	//	System.out.println("k="+k);
	//	System.out.println(m);
		
		int m=0,n=0;
		int p = --m * --n * n-- * m--;
		System.out.println(p);
		
		int a=1;
		int b = a++ + ++a * --a - a--;
		System.out.println(b);
		System.out.println(a);
		
		int ch = 'A';
		System.out.println(ch++);
		System.out.println((char)ch);
		
		int ch1='A';
		System.out.println((int)++ch1);
		
	  double d=1.5,D=2.5;
		double d1=d++ + ++D;
		System.out.println(d);
		System.out.println(D);
		System.out.println(d1);
		
			

		
		
		
	}

}
