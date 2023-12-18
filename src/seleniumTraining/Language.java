package seleniumTraining;

public class Language {
	
	public static void UseLang(Language obj) {
		System.out.println("use this language");
		obj.ReadLanguage();
	}

	public void ReadLanguage() {
		System.out.println("read this language");
	}
	public static void main(String[] args) {

		Language lg=new Language();
		lg.ReadLanguage();
		
		Language.UseLang(lg);
	}

}
