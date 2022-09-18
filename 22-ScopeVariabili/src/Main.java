
/*
 * Scope delle variabili
 * 
 * cos � lo scope di una variabile
 * scope locale
 * scope globale
 */

public class Main {

	public static void main(String[] args) {

		// lo scope di una variabile � quel raggio di azione in cui la variabile � disponibile nel codice
		// � il raggio di azione (per esempio dentro o fuori da un metodo) entro cui le variabili possono essere chiamate e lette

		mioCapitano capitanFuturo = new mioCapitano("Daniele","De Rossi",16,"giallorosso");

		 capitanFuturo.intro();
		 System.out.println("****************************************************");
		 capitanFuturo.scopeLocale(43, 21);
         
        
		
	}

}
