package manipulcao_array_uni;

import java.util.Scanner;

public class ManipulacaoArrayUni {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String [] palavra = new String[5];
				
		System.out.println("Digite 5 nomes: ");
		palavra [0] = sc.next();
		palavra [1] = sc.next();
		palavra [2] = sc.next();
		palavra [3] = sc.next();
		palavra [4] = sc.next();
		
		System.out.println("Nomes na Array: ");
		for (String elementos:palavra) { //foreach
			System.out.print(elementos + " ");
			}
		
		System.out.println();
		System.out.println("Nomes na Array, modo 2:");
		for (int i = 0; i < palavra.length; i++) {
			   System.out.println("Elemento " + i + " = " + palavra[i]);
			}
		
		System.out.println();
		System.out.println("Ordem inversa: ");
		for (int j = palavra.length-1; j >=0; j--) {
			System.out.println("Elemento " + j + " = " + palavra[j]);
				
			}
		
		sc.close();
		}	
	}
