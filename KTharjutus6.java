package kasper_java;

import java.util.Scanner;

public class KTharjutus6 {

	public static void main(String[] args) {
		int num;
	    System.out.println("Sisesta number:");
	    Scanner input = new Scanner(System.in);
	    num = input.nextInt();
	    if ( num % 2 == 0 )
	        System.out.println("Number on paaris");
	     else
	        System.out.println("Number on paaritu");
	}

	}
