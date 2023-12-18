package javaAssignments;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * //1.Write a Java program to create a new array list, which contains all color
		 * names.
		 * 
		 *                  --add some colors (string)
		 * 
		 *                 ---and print out the colorslist using loops.
		 */
		

	     ArrayList<String> colors=new ArrayList<>();
	     colors.add("RED");
	     colors.add("BLUE");
	     colors.add("GREEN");
	     colors.add("YELLOW");
			/*
			 * for(String color:colors) {
			 * 
			 * System.out.println(color); }
			 */

	    //2. Write a Java program to retrieve an element at a specified index from a given array list
		/*
		 * String color=colors.get(2); System.out.println(color);
		 */
	    //3.Write a Java program to update specific array element by given element.

	    // colors.set(1, "PURPLE");
	     //System.out.println(colors);
	     
	    //4.Write a Java program to remove the third element from an array list. 

        //colors.remove(2);
        //System.out.println(colors);
        
        //5.Write a Java program to search an element in an array list using for loop. Once we find that element, break the loop.

		
		/*
		 * String searchcolor="BLUE";
		 * 
		 * for(String color : colors) {
		 * 
		 * if(color.equals(searchcolor)) { System.out.println("Found"+ searchcolor);
		 * break;
		 * 
		 * }
		 * 
		 * }
		 */
        //6. Reverse this array List:
         ArrayList <String> studentNames=new ArrayList<>();
         studentNames.add("Varun");
         studentNames.add("Reena");
         studentNames.add("Naveen");
         studentNames.add("Robin");
         studentNames.add("Peter");
         
         for(int st=studentNames.size()-1;st>=0;st--) {
        	 System.out.println(studentNames.get(st));
         }
         System.out.println("----------");
    	 Collections.reverse(studentNames);
    	 System.out.println(studentNames);
    	 
    	 //7.Write a Java program to extract a portion of an array list.
			/*
			 * colors.add("purple"); ArrayList <String>portion=new
			 * ArrayList<>(colors.subList(1,4)); System.out.println(portion);
			 */
    	 //8.Write a Java program to empty an array list
			/*
			 * colors.clear(); System.out.println(colors);
			 */
    	 //9.Write a Java program to trim the virtual capacity of an array list the current list size.
    	 
			/*
			 * colors.trimToSize(); System.out.println(colors.size());
			 */
    	
    	 //10.Write a Java program to print all the elements of an ArrayList using the position of the elements.
    	 
    	 for(int i=0;i<=colors.size()-1;i++) {
    		 System.out.println("Element at Index"+i+"="+colors.get(i));
    	 }
    		
     }
    
       
	}


