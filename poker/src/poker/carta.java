package poker;

public class carta {
	
	private int numero;
	private String palo;
	
	public static final String[] palos= {"H", "D", "S", "C"};
	public static final int[] numeros= {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
	
	
	
	public carta(int numero, String palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}



	@Override
	public String toString() {
		return "carta: [numero=" + numero + ", palo=" + palo + "]";
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public String getPalo() {
		return palo;
	}



	public void setPalo(String palo) {
		this.palo = palo;
	}



	public static String[] getPalos() {
		return palos;
	}



	public static int[] getNumeros() {
		return numeros;
	}	
	
	
	
	
	

	
	
}
