import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		

		final int TAM = 10;
		final int notasaluno = 4;
		float soma = 0;
		int aluno = 0;
		float media = 0;
		int notas [] = new int [4];
		
		
		for (int i = 0; i < TAM; i++) {
			for (int j = 0; j < notasaluno; j++) {
			System.out.println("Insira as notas: ");
			notas[i] = ent.nextInt();
			soma = notas[i] + soma;
			}	
			media = soma / 4;
			System.out.println("Media do aluno= "+media);
			soma = 0;
			
			if (media >= 7)
				aluno++;
		}
		System.out.println("Numero de alunos a cima da media: "+aluno);
	
		ent.close();
	}

}
