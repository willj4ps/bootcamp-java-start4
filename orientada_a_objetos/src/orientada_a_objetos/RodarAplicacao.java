package orientada_a_objetos;

public class RodarAplicacao {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		carro1.setCor("Vermelha");
		carro1.setModelo("Ferrari");
		carro1.setCapacidadeTanque(50);
		
		System.out.println("Modelo: " + carro1.getModelo());
		System.out.println("Cor: " + carro1.getCor());
		System.out.println("Capacidade Tanque: " + carro1.getCapacidadeTanque());
		System.out.println("Valor Total Tanque: " + carro1.totalValorTanque(7.50));
		
		Carro carro2 = new Carro("Azul", "Porshe", 41);
		
		System.out.println("Modelo: " + carro2.getModelo());
		System.out.println("Cor: " + carro2.getCor());
		System.out.println("Capacidade Tanque: " + carro2.getCapacidadeTanque());
		System.out.println("Valor Total Tanque: " + carro2.totalValorTanque(6.20));

	}

}
