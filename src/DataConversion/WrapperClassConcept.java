package DataConversion;

public class WrapperClassConcept {

	public static void main(String[] args) {

		
		String x="100";
		System.out.println(x+20);
		
		//String to int
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		
		//String to double
		String y="12.33";
		System.out.println(y+10);
		
		double d=Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to boolean
		
		String remoteExecution="true";
		boolean flag=Boolean.parseBoolean(remoteExecution);
		if(flag){
			System.out.println("run tcs on AWS cloud");
		}
		else {
			System.out.println("run tcs on local");
		}
		
		//int to String
		int age=30;
		String ageVal=String.valueOf(age);
		System.out.println(ageVal+20);
		
		//double to String
		double sal=12.33;
		String salValue=String.valueOf(sal);
		System.out.println(salValue.length());
		
		String a="100a";
		//String to int-->Integer
		//int b=Integer.parseInt(a);
	//	System.out.println(b+20);
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		
	}

}
