package jana60calcolatrice;


public class CalcoliHelper {
/*Creare una classe di helper CalcoliHelper. Come visto a lezione, strutturare la classe in modo che non possa essere istanziata (cioè non posso creare oggetti di tipo CalcoliHelper con la parola chiave new) e che presenti i seguenti metodi static:
- Somma di due numeri interi
- Differenza tra due numeri interi
- Moltiplicazione di due numeri interi
- Valore assoluto di un numero intero
- Minimo tra due numeri interi
- Massimo tra due numeri interi*/
	
	private CalcoliHelper() {
		//costruttore privato
	}
	
	//somma
	public static int somma(int a, int b) {
		return a+b;
	}
	
	//differenza
	public static int differenza(int c, int d) {
		return c - d;
	}
	//differenza 2 
	public static int differenza2(int c2, int d2) {
		if(c2 < d2) {
			return d2 - c2;
		}else {
			return d2 - c2;
		}
	}
	
	//moltiplicazione
	public static int moltiplicazione(int e, int f) {
		return e * f;
	}
	
	//valore assoluto
	public static int valoreAssoluto(int h) {
		
		if(h < 0) {
			return h = - h;
		}else {
			return h ;
		}
		
	}
	
	//minimo tra 2 numeri
	public static int numeroMinimo(int i, int l) {
		int minimo;
		if(i < l) {
			minimo= i;
		}else {
			minimo = l;
		}
		return minimo;
	}
	

	//massimo tra due numeri
	public static int numeroMassimo(int r, int r2) {
		int massimo;
		if(r > r2) {
			massimo= r;
		}else {
			massimo = r2;
		}
		return massimo;
	}
	
	/*BONUS per ogni metodo scrivetene una versione che esegue le stesse operazioni ma su parametri double.
	Il fatto di dover scrivere lo stesso metodo per tipi di parametro diversi applica nella pratica uno dei principi di programmazione ad oggetti…Quale? Scrivetelo 
	in un commento all’interno del vostro codice! */
		
		//il principio della programmaione ad oggetti usato è overloading dei metodi sovrascrivendo il metodo cambiando le variabili da int a double
		
	//somma
		public static double somma(double a, double b) {
			return a+b;
		}
		
		//differenza
		public static double differenza(double c, double d) {
			return c - d;
		}
		//differenza 2 
		public static double differenza2(double c2, double d2) {
			if(c2 < d2) {
				return d2 - c2;
			}else {
				return d2 - c2;
			}
		}
		
		//moltiplicazione
		public static double moltiplicazione(double e, double f) {
			return e * f;
		}
		
		//valore assoluto
		public static double valoreAssoluto(double h) {
			
			if(h < 0) {
				return h = - h;
			}else {
				return h ;
			}
			
		}
		
		//minimo tra 2 numeri
		public static double numeroMinimo(double i, double l) {
			double minimo;
			if(i < l) {
				minimo= i;
			}else {
				minimo = l;
			}
			return minimo;
		}
		

		//massimo tra due numeri
		public static double numeroMassimo(double r, double r2) {
			double massimo;
			if(r > r2) {
				massimo= r;
			}else {
				massimo = r2;
			}
			return massimo;
		}
		/*BONUS 2: aggiungete il metodo per l’elevamento a potenza che prende come parametri due numeri interi (base ed esponente) e 
		 * ritorna la base elevata all’esponente. Occhio che sia la base che l’esponente potrebbero essere uguali a zero oppure numeri negativi! (caso esponente = 0 e base = 0 anche se in matematica sarebbe un numero indefinito usiamo l’approccio informatico che lo calcola come 1)*/
		
		public static double calcolaPotenza(int num, int pow){
		        return Math.pow(num,pow);
		}
}
	

