
public class Persona {

	String name;
	String surname;
	int eta;
	String colorePreferito;
	
	// nel main dovremo andare ad assegnari queste propriet� ogni volta che facciamo un oggetto della classe persona
	
	// � il metodo costruttore, se esiste viene chiamato automaticamente quando nel main facciamo: new Persona()
	
	// sintassi costruttore -----> nomeClasse(parametri,propriet� della classe) {}
	 
	Persona(String name, String surname, int eta, String colorePreferito){

		// bisogna assegnare i parametri con la parola chiave this
		// this.caratteristicaClasse = parametroCostruttore
		this.name = name;
		this.surname = surname;
		this.eta = eta;
		this.colorePreferito = colorePreferito;
	}
	
	
}
