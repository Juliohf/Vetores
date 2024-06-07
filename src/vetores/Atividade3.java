package vetores;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int somap = 0;
		int somas = 0;
		
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("Diagonal Principal: ");
		for(int i=0;i<3;i++) {
			somap += mat[i][i];
				System.out.println(mat[i][i]);
			}
		
		System.out.println("Diagonal Secundaria: ");
		for(int i=0;i<3;i++) {
				somas += mat[i][3 - 1 - i];
				System.out.println(mat[i][3 - 1 - i]);
			}
		
		System.out.println(somap);
		System.out.println(somas);
				
		sc.close();

	}

}
