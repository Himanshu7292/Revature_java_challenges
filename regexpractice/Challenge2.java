package regexpractice;
import java.util.*;
import java.util.Scanner;

public class Challenge2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		Secured(s);
	}
	public static void Secured(String a) {
		if(a.contains("https")) {
			System.out.println("webpage is secure");
		}
		else {
			System.out.println("webpage is not secure ");
		}
		
	}
	

}
