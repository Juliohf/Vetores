package vetores;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int soma = 0;
		

				
			System.out.println("Bem vindo ao construa seu vetor: ");
			int[] vect = new int[11];
			
			
			for (int i=1; i<11; i++) {
				System.out.println("Digite o " + i + "°número: ");
				int n1 = sc.nextInt();
				vect[i] = n1;
			}

			System.out.println("Elementos impares: ");
			for (int i = 1; i < 11; i+= 2) {
				System.out.println(vect[i]);
			}
			
			System.out.println("Numeros pares: ");
			for (int i = 1; i < 11; i++) {
				if (vect[i] % 2 == 0)
				System.out.println(vect[i]);
			}
			
			System.out.println("Soma dos elementos: ");
			for (int i = 1; i < 11; i++) {
				soma += vect[i];				
			}
			System.out.println(soma);
			
			System.out.println("Média dos elementos: ");
			float somafloat = (float) soma;
			System.out.println( somafloat / 10.0);
					
		
		sc.close();
			
		}

}
