package vetores;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		int[] vect = {2,5,1,3,4,9,7,8,10,6};
		boolean achou = false;
		
		System.out.println("Digite um número: ");
		int nr = sc.nextInt();
		int pos = 0;
				

		for (int i = 0; i < 10; i++) {	
				int n1 = vect[i];
				if (n1 == nr) {
					achou = true;
					pos = i;
					break;
				} 
		}	
				
			if (achou == true) {
				System.out.println("O numero digitado está na posição:" + pos);
			} else {
				System.out.println("Numero não encontrado! Tente novamente mais tarde.");
			}

		
		
		
		
		
		
		
		
		sc.close();
	}

}
