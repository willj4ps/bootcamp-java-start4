package manipulacao_array_multi;
import java.util.Locale;
import java.util.Scanner;

public class ManipulacaoArrays {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String[] nomes = { "José", "Maria", "Ana", "Paulo", "Jéssica" };
		String[][] nomes2 = { { "teste" }, { "teste2" }, { "teste3" } };
		System.out.println(nomes.length);
		System.out.println(nomes2.length);

		for (int i = 0; i < nomes.length; i++) {
			System.out.print(nomes[i] + " ");
		}

		System.out.println();

		for (String elementos1 : nomes) {
			System.out.print(elementos1 + " ");
		}

		System.out.println();

		for (int i = nomes.length - 1; i >= 0; i--) {
			System.out.print(nomes[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < nomes2.length; i++) {
			for (int j = 0; j < nomes2[i].length; j++) {
				System.out.print(nomes2[i][j] + " ");
			}

		}

		System.out.println();

		for (String[] i : nomes2) {
			for (String j : i) {
				System.out.print(j + " ");
			}
		}

		sc.close();
	}

}
