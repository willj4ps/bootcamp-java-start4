package calculadora;

public class Calculadora {
	
	public static void soma(double numero1, double numero2) {
		
		double resultado = numero1 + numero2;
		System.out.println("Fun��o escolhida: Soma");
		System.out.println(numero1 + " + " + numero2 + " = " + resultado);
		System.out.println();
				
	}
	
	public static void subtracao(double numero1, double numero2) {
		
		double resultado = numero1 - numero2;
		System.out.println("Fun��o escolhida: Subtra��o");
		System.out.println(numero1 + " - " + numero2 + " = " + resultado);
		System.out.println();
				
	}
	
	public static void multiplicacao(double numero1, double numero2) {
		
		double resultado = numero1 * numero2;
		System.out.println("Fun��o escolhida: Multiplica��o");
		System.out.println(numero1 + " * " + numero2 + " = " + resultado);
		System.out.println();
				
	}
	
	public static void divisao(double numero1, double numero2) {
		
		double resultado = numero1 / numero2;
		System.out.println("Fun��o escolhida: Divis�o");
		System.out.println(numero1 + " - " + numero2 + " = " + resultado);
		System.out.println();
				
	}

}
