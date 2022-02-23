package tabuada;

import java.util.Locale;
import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tabuado do 1 ao 10: ");
		System.out.println();
		
		for (int i=1; i<=10; i++) {
			System.out.println();
			System.out.println("Tabuada do: " + i);			
			for (int j=1; j<=10; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
			sc.close();
		}
	}
}
