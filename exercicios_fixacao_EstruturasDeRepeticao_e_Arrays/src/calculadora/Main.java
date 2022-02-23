package calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		
		while (true) {
			Mensagem.mensagem();
			Scanner sc = new Scanner(System.in);
			int operacao = sc.nextInt();
			
			if (operacao == 0) {
				System.out.println("Encerrando o programa...");
				break;
			}
			else if(operacao <0 || operacao>4) {
				System.out.println();
				System.out.println("Opção inválida! Digite uma das opções abaixo");
				continue;
			}
			else if(operacao == 1) {
				System.out.print("Digite o valor1: ");
				double valor1 = sc.nextDouble();
				
				System.out.print("Digite o valor2: ");
				double valor2 = sc.nextDouble();
				
				Calculadora.soma(valor1, valor2);
			}
			else if(operacao == 2) {
				System.out.print("Digite o valor1: ");
				double valor1 = sc.nextDouble();
				
				System.out.print("Digite o valor2: ");
				double valor2 = sc.nextDouble();
				
				Calculadora.subtracao(valor1, valor2);
			}
			else if (operacao == 3) {
				System.out.print("Digite o valor1: ");
				double valor1 = sc.nextDouble();
				
				System.out.print("Digite o valor2: ");
				double valor2 = sc.nextDouble();
				
				Calculadora.multiplicacao(valor1, valor2);
			}
			else if (operacao == 4) {
				System.out.print("Digite o valor1: ");
				double valor1 = sc.nextDouble();
				
				System.out.print("Digite o valor2: ");
				double valor2 = sc.nextDouble();
				
				Calculadora.divisao(valor1, valor2);
			}
			else {
				sc.close();
			}
		}
	}
}
