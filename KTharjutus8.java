package kasper_java;

import java.util.Scanner;

public class KTharjutus8 {

	public static void main(String[] args) {
		String a, b = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Sisesta tekst:");
        a = s.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("Tekst on palindroom.");
        }
        else
        {
            System.out.println("Tekst ei ole palindroom.");
	}

	}
}
