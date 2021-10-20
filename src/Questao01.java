import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);

		
		int vetor[] = new int [5];
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Insira o " +(i+1)+" numero: ");
			vetor[i] = ent.nextInt();
			
		}
		for (int n = 0; n < vetor.length; n++) {
			System.out.println(+vetor[n]);
		}
		
		
		
		ent.close();
	}

}
