package vetores;

import java.security.SecureRandom;
import java.util.Scanner;


public class Atividade4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 double[][] mat= {
		            {4.0, 5.0, 7.0, 3.0},
		            {2.5, 6.5, 4.7, 8.0},
		            {10.0, 8.5, 9.5, 8.0},
		            {9.0, 6.5, 7.6, 8.2},
		            {5.0, 5.0, 5.0, 6.3},
		            {7.0, 8.0, 9.0, 8.5},
		            {5.5, 3.5, 2.5, 1.0},
		            {8.0, 9.0, 10.0, 9.5},
		            {5.6, 5.8, 6.5, 7.0},
		            {7.5, 8.5, 9.5, 10.0}
		        };
		 
		 double[] vet = new double[10];
		 
		 for(int i=0;i<10;i++) {
			 double soma = 0.0;
			 for(int j=0; j<4;j++) {
				 soma += mat[i][j];
			 }
			 vet[i]= soma;

			 }

		for(int i=0;i<10;i++) {
			System.out.println("A média do " + (i+1) + "º aluno é: "+ vet[i]/4);
		}
		
		sc.close();
	}

}
