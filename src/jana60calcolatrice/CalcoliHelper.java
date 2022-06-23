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
		if(h<0) {
			h=h;
		}
		return h;
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
		
}
	

