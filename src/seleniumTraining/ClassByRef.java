package seleniumTraining;

public class ClassByRef {
	
	public static void sendMail(ClassByRef ref)
	{
		System.out.println("Send mail");
		ref.ReadMail();
	}
	public void ReadMail() {
		System.out.println("Read mail");
	}
	public static void main(String[] args) {

		ClassByRef obj=new ClassByRef();
		obj.ReadMail();
		
	}

}
