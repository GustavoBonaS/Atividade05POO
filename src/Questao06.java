import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		final int TAM = 20;
		int vetnum[] = new int[TAM];
		int numpar = 0;
		int numimpar = 0;

		for (int i = 0; i < TAM; i++) {
			System.out.print("Numeros:");
			vetnum[i] = ent.nextInt();
		}
		for (int i = 0; i < TAM; i++) {
			if (vetnum[i] % 2 == 0) {
				numpar = numpar + 1;
			} else
				numimpar = numimpar + 1;
		}

		int vetpar[] = new int[numpar];
		int vetimpar[] = new int[numimpar];

		for (int i = 0; i < TAM; i++) {
			if (vetnum[i] % 2 == 0) {
				numpar++;
				vetpar[numpar] = vetnum[i];
			} else
				numimpar++;
			vetimpar[numimpar] = vetnum[i];
		}
		System.out.println("|" + vetnum[TAM]);
		System.out.println("|" + vetpar[numpar]);
		System.out.println("|" + vetimpar[numimpar]);

		ent.close();
	}

}
