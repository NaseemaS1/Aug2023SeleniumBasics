package StringConcept;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {

		String str="Hi this is my java code and i am so happy";
		
		System.out.println(str.length());
		System.out.println("LI="+0);
		System.out.println("HI="+(str.length()-1));
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(40));
		//System.out.println(str.charAt(41));
		//System.out.println(str.charAt(-1));
		
		System.out.println(str.indexOf("H"));
		System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf("i",2));
		System.out.println(str.indexOf("i", str.indexOf("i")+1));
		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("Naveen"));
		
		String msg="Welcome null";
		if(msg.indexOf("admin")!=-1) {
			System.out.println("admin is there");
		}
		else {
			System.out.println("Fail");
		}
		
		//trim
		
		String sr=" hello word ";
		System.out.println(sr.trim());
		
		//replace
		String dob="01-01-1990";
		dob=dob.replace("-", "/");
		System.out.println(dob);
		String sr1="hello world";
		System.out.println(sr1.replace(" ", ""));
	
		//tolower and toupper
		String sf="this is java";
		System.out.println(sf.toLowerCase());
		System.out.println(sf.toUpperCase());
		
		//Comparision
		String l1="Hello Selenium";
		String l2="Hello selenium";
		System.out.println(l1.equals(l2));
		System.out.println(l1.equalsIgnoreCase(l2));
		
		//Contains
		
		String m1="Hello this is java lang";
		System.out.println(m1.contains("java"));
		if(m1.contains("java")) {
			System.out.println("pass");
		}
		else {
			System.out.println("Faill");
		}
		
		
		//sub-string
		
		String loop="your order id is 1234";
		System.out.println(loop.substring(7));
		System.out.println(loop.substring(0, 7));
		System.out.println(loop.substring(loop.indexOf("is")+3, loop.length()));

         //Split
		String lang="JAVA_PHYTHON_RUBY_JAVASCRIPT";
		String lg[]=lang.split("_");
		System.out.println(lg[0]);
		System.out.println(Arrays.toString(lg));







		
	}

}
