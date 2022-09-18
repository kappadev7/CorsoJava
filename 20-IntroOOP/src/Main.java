
/*
 * Introduzione OOP (Object Oriented Programing)
 * 
 * cos'� la programmazione a oggetti
 * classi, metodi e attributi
 * classe con file esterno
 * cosa sono gli oggetti e le istanze di classe
 * usare attributi e metodi
 * 
 */

public class Main {

	// la programmazione a oggetti � una programmazione che si prefissa di suddividere il programam secondo diversi tipi di oggetti.
	// si vanno a ricreare entit� che esistono nella vita reale e si vanno a trattare come oggetti veri e propri anche in programmazione.
	// ogni oggetto ha delle caratteristiche(attributi) e ha delle azioni(metodi) che pu� eseguire
	
	public static void main(String[] args) {

		// tipo di dato Persona	
		// l'oggetto � un istanza di una classe
		// istanzio l'oggetto 
		
		// l'oggetto erediter� quindi i metodi e le propriet� del suo tipo di dato Reference: Persona
		
		Persona persona1 = new Persona();
		
	    System.out.println(persona1.nome);
	    System.out.println("*************************************");
	    System.out.println(persona1.titolo);
	    System.out.println("*************************************");
	    System.out.println(persona1.notoCome);
	    System.out.println("*************************************");
	    System.out.println(persona1.eta);
	    System.out.println("*************************************");

		persona1.personaggio();
	    System.out.println("*************************************");

		persona1.anni();
		
		// posso creare un nuovo oggetto di tipo Persona
		
		// l'istanza di una classe sono gli oggetti che derivano da quella classe... 
		// in questo caso derivano dalla classe di tipo Persona, sono stampati con lo "stampino" Persona. 
		// tuttavia, persona1 e persona2, sono oggetti totalmente diversi, 
		// anche se in questo caso il contenuto mandato a schermo � il medesimo
		
		Persona persona2 = new Persona();
	}
	
	
	// il costruttore servir� a stampare oggetti diversi con propriet� diverse...
	// � una funzione che viene chiamata quando stampiamo e serve a creare oggetti diversi della istanza persona
	// ma con caratteristiche diverse

}
