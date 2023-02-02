package Juegos;

import java.util.Scanner;

public class RuletaRusa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		String resposta;
		int[] arr= {1,2,3,4,5,6};
		int ns= (int) (Math.random()*6+1);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Do you pull the trigger?");
			resposta = entrada.nextLine();
			if(resposta=="NO") {
				System.out.println("What a pity, you miss the best...");
				i=arr.length;
			}else {
				if (ns==arr[i]) {
					System.out.println("You die.");
					i=arr.length;
				}else {
					System.out.println("OMG GUYS");
				}
			
			}
		}
		
	}

}
