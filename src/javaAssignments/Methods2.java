package javaAssignments;

public class Methods2 {
	
	//4. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
	public int max(int a,int b,int c) {
		int m=Math.max(a, b);
		int max=Math.max(m,c);
		System.out.println("maximum number is:"+max);
		return max;
		
	}
	public void min(int a,int b,int c) {
		
	/*
	 * int m1=Math.min(a, b); int min=Math.min(m1, c);
	 * System.out.println("minimum number is:"+min); return min; }
	 */
		if(a<b && a<c) {
			System.out.println("miniumum num is:"+a);
		}
		else if(b<c) {
			System.out.println("minimum num is:"+b);
		}
		else {
			System.out.println("minimum num is:"+c);
		}
	}
	public static void main(String[] args) {

		Methods2 rs=new Methods2();
		int s=rs.max(12, 65, 56);
		System.out.println(s);
		//int s1=rs.min(12, 65, 56);
		//System.out.println(s1);
		rs.min(12, 65, 56);
	}

}
