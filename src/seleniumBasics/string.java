package seleniumBasics;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String greeting="Hello";
    System.out.println(greeting);	
    /*String length*/
    String txt="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The Length of the string is: " +txt.length());
	
  /*more string methods*/
	String strTxt1="Hello World";
	System.out.println(strTxt1.toUpperCase());
	System.out.println(strTxt1.toLowerCase());
	String strTxt2="please locate where 'locate' occurs!";
	System.out.println(strTxt2.indexOf("locate"));
    /*string concatenation*/
	String firstName="john";
	String lastname="Doe";
	System.out.println(firstName + " " + lastname);
	System.out.println(firstName.concat(lastname));
	String txt1="We are so called \"vikings\" from the north";
	System.out.println(txt1);
	String txt2="IT\'S ALRIGHT.";
	System.out.println(txt2);
	String txt3="this is \\ called backslah";
	System.out.println(txt3);
	
	}
}
