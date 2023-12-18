package javaAssignments;

import java.util.ArrayList;

public class LOOPS {

	public static void main(String args[]) {
		int x = 1;
		while (x <= 10) {
			System.out.println(x);
			if (x % 7 == 0) {
				System.out.println("bye");
				break;
			}
			x++;
		}

		// 10 colors print even colors
		ArrayList<String> colors = new ArrayList<>();
		colors.add("RED");
		colors.add("BLUE");
		colors.add("GREEN");
		colors.add("YELLOW");
		colors.add("purple");
		colors.add("Indigo");
		colors.add("Orange");
		colors.add("Violet");
		colors.add("Pink");
		colors.add("Orange");

		for (int i = 0; i <= colors.size() - 1; i++) {
			if (i % 2 == 0) {

				System.out.println(i + "=" + colors.get(i));
			}
		  
	    }
	    
}
}
