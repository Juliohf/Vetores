package vetores;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int cont = 0;
		
				for(int i=0;i<n;i++) {
					for(int j = 0;j<n;j++) {
						if (mat[i][j] < 0) {
							cont++;
						};
					}
				}
	System.out.println(cont);
		
		
		
		
		
		
		sc.close();
		
		

	}

}
