package orientada_a_objetos.polimorfismo_e_sobrescrita;

public class RodarAplicacao {

	public static void main(String[] args) {
		
		// Vetor do tipo ClasseMae, criado para receber os 3 objetos
		ClasseMae[] classes = new ClasseMae[] {new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};
		
		for (ClasseMae classe: classes) { 
			classe.metodo1(); // percorre os 3 objetos e chama o metodo1 de cada um deles (se tiver)
		} // ocorreu o polimorfismo em ClasseFilha1 porque inferiu em tempo de execução
		 // em outras palavras, o método se comportou de acordo com o tipo de dado, ou seja, ClasseFilha1
		 // ocorreu o polimorfismo também em ClasseFilha2 
		// Já para ClasseMae não ocorreu polimorfismo porque o tipo é igual ao objeto, sendo assim, apenas chamou o método
		
		System.out.println("");
		
		for (ClasseMae classe: classes) { // percorre os 3 objetos e chama o método2 de cada um deles (se tiver)
			classe.metodo2(); // Não ocorre o polimorfismo em ClasseFilha1 porque não há metodo2 nela, sendo assim, executa o metodo2 da ClasseMae
		}					  // Em seguida ocorre o polimorfismo em ClasseFilha2
							 // E por fim, não ocorre o polimorfimo em ClasseMae, pois são do mesmo tipo e assim executado o método de sua própria ClasseMae
		
		System.out.println("");
		
		// Nas duas linhas abaixo não teve polimorfismo, teve SOBRESCRITA
		ClasseFilha2 classeFilha2 = new ClasseFilha2(); // Aqui trabalha diretamente com a classe filha
		classeFilha2.metodo2();							// Com isso ocorre a sobrescrita pura

	}

}
