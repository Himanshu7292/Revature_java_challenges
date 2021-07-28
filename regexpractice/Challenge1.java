package regexpractice;

import java.util.Scanner;

public class Challenge1 {

	public static void main(String[] args) {
	
        Scanner sc =new Scanner(System.in);
        String s= sc.nextLine();
       System.out.println( Domain_name(s));
	
	}
	public static String Domain_name(String b) {
			
	String a= b.replaceAll("https://", "");
	String url[]= a.split("/");
	return url[0];
	}

}
