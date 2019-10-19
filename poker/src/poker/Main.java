package poker;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		int player_1 = 0;
		int player_2 = 0;
		
		baraja baraj = new baraja();
		
		baraj.crearbaraja();
		
	
		carta cartaplayer1;
		carta cartaplayer2;
		
		carta player1[] = new carta[5];
		
		carta player2[] = new carta[5];
		

/*		carta carta1 = new carta(6, "H");
		carta carta2 = new carta(9, "H");
		carta carta3 = new carta(5, "H");
		carta carta4 = new carta(4, "H");
		carta carta5 = new carta(2, "H");
		
		player2[0] = carta1;
		player2[1] = carta2;
		player2[2] = carta3;
		player2[3] = carta4;
		player2[4] = carta5;
	
		player = baraj.comparar(player2);
		System.out.println("valor del jugador: "+player);
*/			
		
		for(int i = 0; i<=4; i++) {			
			cartaplayer1 = baraj.darcarta();
			cartaplayer2 = baraj.darcarta();
			if (cartaplayer1 != null && cartaplayer2 != null) {				
				player1[i] = cartaplayer1;
				player2[i] = cartaplayer2;
			}else {
				i--;
			}			
		}
		
		for (int j = 0; j < player1.length; j++) {
			System.out.println(player1[j]);
		}
		
		
		
		System.out.println("");
		player_1 = baraj.comparar(player1);
		
		System.out.println("");
		
		for (int j = 0; j < player2.length; j++) {
			System.out.println(player2[j]);
		}
	
		System.out.println("");		
		
		player_2 = baraj.comparar(player2);
		
		System.out.println("");	


		if (player_1 > player_2) {
			System.out.println("gano el jugador 1");
		}else if (player_1 < player_2) {
			System.out.println("gano el jugador 2");
		}else {
			System.out.println("los jugadores quedaron empatados");
		}
		
		
		
		}	
		
		
	
}
	
	


