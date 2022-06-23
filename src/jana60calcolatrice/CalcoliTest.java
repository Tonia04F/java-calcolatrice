package jana60calcolatrice;


public class CalcoliTest {
/*Create anche una classe CalcoliTest con il metodo main in cui testate tutti i metodi della 
 * vostra classe di helper (con un esempio per ogni casistica)*/

	public static void main(String[] args) {
		
		System.out.println("La somma dei due interi è: " + CalcoliHelper.somma(4, 6));
		System.out.println("La differenza dei due interi è: " + CalcoliHelper.differenza(8,4));
		System.out.println("Il risultato della moltiplicazione dei due interi è: " + CalcoliHelper.moltiplicazione(5, 6));
		System.out.println("Il numero minimo è: " + CalcoliHelper.numeroMinimo(10, 8));
		System.out.println("Il numero massimo è: " + CalcoliHelper.numeroMassimo(20, 30));
		System.out.println("Il valore assoluto è: "+ CalcoliHelper.valoreAssoluto(-5));
	}

}
