package orientada_a_objetos.herança.upcast_e_downcast;

public class RodarAplicacao {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario(); // Aqui a classe foi instânciada no objeto
		
		Funcionario gerente = new Gerente(); // Upcast
		Funcionario vendedor = new Vendedor(); // Upcast
		Funcionario faxineiro = new Faxineiro(); // Upcast
		
		// Gerente gerente_ = new Funcionario(); // - Erro na sintaxe de Downcast, pois não está explícito
		Vendedor vendedor_ = (Vendedor) new Funcionario(); // Downcast
		// Da forma como está ocorre erro, pois podem ter dados na superclasse Funcionário,
		//mas não necessariamente terão dados da subclasse Vendedor em Funcionário

	}

}
