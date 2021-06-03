package kasper_java;

import java.util.Scanner;

public class KTharjutus5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sisesta esimene takisti: ");
		double arv1 = scanner.nextInt();
		System.out.print("Sisesta teine arv: ");
		double arv2 = scanner.nextInt();
		double vastus = arv1+arv2;
		System.out.print("Kogutakistus on  "+ vastus);
	}

	}
