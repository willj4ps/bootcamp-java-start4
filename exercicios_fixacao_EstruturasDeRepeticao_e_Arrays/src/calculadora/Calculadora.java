package calculadora;

public class Calculadora {
	
	public static void soma(double numero1, double numero2) {
		
		double resultado = numero1 + numero2;
		System.out.println("Função escolhida: Soma");
		System.out.println(numero1 + " + " + numero2 + " = " + resultado);
		System.out.println();
				
	}
	
	public static void subtracao(double numero1, double numero2) {
		
		double resultado = numero1 - numero2;
		System.out.println("Função escolhida: Subtração");
		System.out.println(numero1 + " - " + numero2 + " = " + resultado);
		System.out.println();
				
	}
	
	public static void multiplicacao(double numero1, double numero2) {
		
		double resultado = numero1 * numero2;
		System.out.println("Função escolhida: Multiplicação");
		System.out.println(numero1 + " * " + numero2 + " = " + resultado);
		System.out.println();
				
	}
	
	public static void divisao(double numero1, double numero2) {
		
		double resultado = numero1 / numero2;
		System.out.println("Função escolhida: Divisão");
		System.out.println(numero1 + " - " + numero2 + " = " + resultado);
		System.out.println();
				
	}

}
