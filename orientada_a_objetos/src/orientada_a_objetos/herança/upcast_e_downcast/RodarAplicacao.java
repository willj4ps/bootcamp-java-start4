package orientada_a_objetos.heran�a.upcast_e_downcast;

public class RodarAplicacao {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario(); // Aqui a classe foi inst�nciada no objeto
		
		Funcionario gerente = new Gerente(); // Upcast
		Funcionario vendedor = new Vendedor(); // Upcast
		Funcionario faxineiro = new Faxineiro(); // Upcast
		
		// Gerente gerente_ = new Funcionario(); // - Erro na sintaxe de Downcast, pois n�o est� expl�cito
		Vendedor vendedor_ = (Vendedor) new Funcionario(); // Downcast
		// Da forma como est� ocorre erro, pois podem ter dados na superclasse Funcion�rio,
		//mas n�o necessariamente ter�o dados da subclasse Vendedor em Funcion�rio

	}

}
