package regexpractice;

import java.util.Scanner;

public class challenge4 {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("ENTER THE VALUE OF A :");
     double a =Double.parseDouble(sc.nextLine());
     System.out.println("ENTER THE VALUE OF B :");
     double b =Double.parseDouble(sc.nextLine());
     System.out.println("the hypotnuse is : " + hypotnuse(a, b));
	}
	
	public static double hypotnuse(double x,double y) {
		return Math.pow(((Math.pow(x,2))+(Math.pow(y, 2))),0.5);
	}

}
