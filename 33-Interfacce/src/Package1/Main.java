package Package1;

/*
 * 
 * Interfacce 
 * 
 */
public class Main {

	public static void main(String[] args) {

		/*

		le interfacce sono simili alle classi astratte. 
		hanno metodi senza body
		mentre una classe pu� estendere solo un altra classe, al contrario pu� implementare pi� interfacce.
		
		un interfaccia pu� essere correlata ha cose che apparentemente non sono collegatre tra loro
		esempio: classi pesci, leoni, gazzelle interfaccia: preda, predatore
		i leoni sono predatori, le gazzelle sono prede, ma i pesci possono essere tutti e due...
		
		
		attraverso le intefaccia si possono attribuire funzionalit� (metodi e propriet�) a una particolare classe o a pi� di una.
		
		
		
		quindi mentre una classe astratta viene ereditata e si pu� erditare solo da una classe, le interfacce possono essere implementate pi� di una
		utili quando si vogliono implementare caratteristiche (non i valori, quelli differiscono) simili in classe diverse
		
		*/
		
		Leone leone = new Leone();
		Gazzella gazzella = new Gazzella();
		Pesce pesce = new Pesce();
		
		leone.caccia();
		gazzella.scappa();
		pesce.caccia();
		pesce.scappa();
	}

}
