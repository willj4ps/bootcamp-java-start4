package orientada_a_objetos_interface;

public class RodarAplicacao {
	
	public static void main(String [] args) {
		
		Calculadora calculadora = new Calculadora();
		
		calculadora.soma(2.0, 3.5);
		calculadora.subtracao(8.9, 2.5);
		calculadora.multiplicacao(5.0, 10.0);
		calculadora.divisao(55.0, 5.0);
		
	}

}
