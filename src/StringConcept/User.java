package StringConcept;

public class User {

	public static void main(String[] args) {
          
		//String in a class
		//1.using NEW Keyword
		String s1=new String("Hello");//2-heap,scp
		
		
		
		//2.using literals
		String s2="Selenium";//1
		
		String s3="Hello";
		String s4= new String("Hello");
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
		String s5="Hello";
		System.out.println(s3==s5);
		System.out.println(s1.equals(s5));
		String s6="hello";
		String s7=new String("Naveen");
		String s8=s7.intern();
		System.out.println(s7==s8);
		
		String str="Hello";
		System.out.println(str+100);
		System.out.println(str+200);
		
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.append("Automation"));
		System.out.println(sb);
	}

}
