package poker;

import java.util.Random;

import javax.lang.model.element.VariableElement;
import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;
import java.util.Arrays; 
import java.util.stream.IntStream;
import java.util.stream.IntStream;

public class baraja {
	
	private carta cartas[];	
	

	public baraja() {
		this.cartas = new carta[52];
	}

	public void crearbaraja() {
		
		String[] palos = carta.palos;
		int[] numeros = carta.numeros;
		int k=0;
		
		for(int i = 0; i < palos.length; i++)
		{
			for(int j = 0; j<numeros.length; j++) 
			{		
				
				
				/*System.out.print(numeros[j]);				
				System.out.print(palos[i]);
				System.out.print(" ");*/
				
				cartas[k] = new carta(numeros[j], palos[i]);
				k=k+1;
				
				
							
				
			}
		}
	}
	
	public void mostarbaraja() {
		
		for (int i = 0; i < cartas.length; i++) {
			  System.out.println(cartas[i]);
			 
			}
		System.out.println("Longitud array baraja:" +cartas.length);
	}
	
	public carta darcarta() {
		
		Random rnd = new Random();
		int randonnum = rnd.nextInt(52);
		
		carta carta = cartas[randonnum];		
		
        cartas[randonnum] = null;
		
		
		return carta;
		
	}
	
	public int comparar(carta player_1[]) {
		
		int x=0;
		int y=0;
		int z=0;
		
		String juego[];
		int numeros[];
		numeros = new int[5];
		int menor, menor1;
		boolean flag = false;
		menor = menor1 = player_1[0].getNumero();	
		
		
		for (int i = 0; i < player_1.length; i++) {
			numeros[i] = player_1[i].getNumero();
		}
		
		Arrays.sort(numeros);
		menor = numeros[0];
		
				

		
		
		
		
		for (int j = 0; j < player_1.length; j++) {		
			
			for (int k = 0; k < player_1.length; k++) {
				if (j != k) {
					
					
					
					if (player_1[j].getNumero() == player_1[k].getNumero() ) {					
						x = x+1;
						
						
					}
					
					if (player_1[j].getPalo() == player_1[k].getPalo() && player_1[j].getNumero() != player_1[k].getNumero()) {
						y = y+1;
						
						
						
						
						
					}					
				}				
			}
			
		}
		
		
		for (int i = 0; i < player_1.length; i++) {							
			
			if (menor == numeros[i]) {
				
				menor = menor + 1;
				z = z + 1;
				
				
			}				
			
		}
			
		
		
		if (x == 12) {
			
			System.out.println("El jugador tiene Poker");
			
		}
		
		if (x == 8) {
			System.out.println("El jugador tiene Full House");
		}
		
		if (x == 4) {
			System.out.println("El jugador tiene Doble Par");
		}
		
		if (x == 6) {
			System.out.println("El jugador tiene Trio");
		}
			
		if (x == 2){
			System.out.println("El jugador tiene Par");
											    
		}
		if (z == 5) {
			x=z;
			System.out.println("El jugador tiene Escalera");
			System.out.println(x);
		}
		
		if (y == 20) {
			x=y;
			
			System.out.println("El jugador tiene Color");
			System.out.println(x);
		}
		
		if(x==0) {
			System.out.println("El jugador NO tiene juego");
		}
		
	
	
	return x;	
	}
	
	

}
