import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
	
		Scanner ent = new Scanner(System.in);
		
		 float vetor [] = new float [10];
		 int n = 10;
		 
		 for (int i = 0; i < 10; i++) {
				System.out.print("Insira o " +(i+1)+" numero: ");
				vetor[i] = ent.nextInt();
				
			}
		while (n <= 0) {
			System.out.print("||" + vetor[n] );
			n = n-1;
		}
			
			
			
			ent.close();
		}
		

	}


