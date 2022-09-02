package class1;

import java.util.Scanner;

public class class1 {

	public class1() {
		// TODO Auto-generated constructor stub
		 Scanner in = new Scanner(System.in);
		   
		  System.out.print("Enter the height of the first person: ");
		  int num1 = in.nextInt();
		  System.out.print("Enter the height of the second person: ");
		  int num2 = in.nextInt();
		  System.out.print("Enter the height of the third person: ");
		  int num3 = in.nextInt();
		  System.out.print("Enter the height of the fourth person: ");
		  int num4 = in.nextInt();
		  System.out.print("Enter the height of the fifth person: ");
		  int num5 = in.nextInt();
		  System.out.println("The Average of five numbers is: " + 
		   (num1+num2+num3+num4+num5)/5);
		  
	}

}
