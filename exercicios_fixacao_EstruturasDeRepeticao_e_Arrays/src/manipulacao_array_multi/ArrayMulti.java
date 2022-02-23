package manipulacao_array_multi;

import java.util.Random;
import java.util.Scanner;
public class ArrayMulti {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		Random gerador = new Random();
        
        System.out.print("Digite o número de linhas: ");
        int matrizLinha = sc.nextInt();
        System.out.print("Digite o número de colunas: ");
        int matrizColuna = sc.nextInt();
  
		int[][] matriz = new int[matrizLinha][matrizColuna]; // A matriz recebe o valor de linha e coluna digitada pelo usuário
		
		System.out.println("\nMatriz construída: \n");
		for(int linha=0 ; linha < matrizLinha ; linha++){ // "for" utilizado para a construção da linha da matriz
            for(int coluna = 0; coluna < matrizColuna ; coluna ++){ // "for" utilizado para a construção da coluna da matriz
                matriz[linha][coluna] = gerador.nextInt(9); // Matriz sendo construída com números aleatórios de 0 a 9
                System.out.printf(" %d ",matriz[linha][coluna]);
            }
            System.out.println();
        }   
        sc.close();
        }
}
