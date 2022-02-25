package orientada_a_objetos.polimorfismo_e_sobrescrita;

public class RodarAplicacao {

	public static void main(String[] args) {
		
		// Vetor do tipo ClasseMae, criado para receber os 3 objetos
		ClasseMae[] classes = new ClasseMae[] {new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};
		
		for (ClasseMae classe: classes) { 
			classe.metodo1(); // percorre os 3 objetos e chama o metodo1 de cada um deles (se tiver)
		} // ocorreu o polimorfismo em ClasseFilha1 porque inferiu em tempo de execu��o
		 // em outras palavras, o m�todo se comportou de acordo com o tipo de dado, ou seja, ClasseFilha1
		 // ocorreu o polimorfismo tamb�m em ClasseFilha2 
		// J� para ClasseMae n�o ocorreu polimorfismo porque o tipo � igual ao objeto, sendo assim, apenas chamou o m�todo
		
		System.out.println("");
		
		for (ClasseMae classe: classes) { // percorre os 3 objetos e chama o m�todo2 de cada um deles (se tiver)
			classe.metodo2(); // N�o ocorre o polimorfismo em ClasseFilha1 porque n�o h� metodo2 nela, sendo assim, executa o metodo2 da ClasseMae
		}					  // Em seguida ocorre o polimorfismo em ClasseFilha2
							 // E por fim, n�o ocorre o polimorfimo em ClasseMae, pois s�o do mesmo tipo e assim executado o m�todo de sua pr�pria ClasseMae
		
		System.out.println("");
		
		// Nas duas linhas abaixo n�o teve polimorfismo, teve SOBRESCRITA
		ClasseFilha2 classeFilha2 = new ClasseFilha2(); // Aqui trabalha diretamente com a classe filha
		classeFilha2.metodo2();							// Com isso ocorre a sobrescrita pura

	}

}
