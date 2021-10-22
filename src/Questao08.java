import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ent =  new Scanner(System.in);
		
		final int TAM = 5;
		int vetnum[] = new int [TAM];
		int soma = 0;
		int mult = 1;
		
		for (int i = 0; i < TAM; i++) {
			System.out.println("Numeros: ");
			vetnum[i] = ent.nextInt();
			
			soma = vetnum[i] + soma;
			
			mult = vetnum[i] * mult;
		}
		for (int i = 0; i < TAM; i++) {
			System.out.println("Numeros: "+vetnum[i]);
		}
		System.out.println("Soma: "+soma);
		System.out.println("Multiplicação: "+mult);
	
		ent.close();
	}
	

}
