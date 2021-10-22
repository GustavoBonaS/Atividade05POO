
public class Questao05 {

	public static void main(String[] args) {
		
		
		final int TAM = 10;
		char vet[] = {'b' , 'o' , 'w' ,'j','e','i','g','b','n','d'};
		int n = 0;
	
		for (int i = 0; i < TAM; i++) {
			if( vet[i] != 'a' || vet[i] != 'e' || vet[i] != 'i' || vet[i] != 'o' || vet[i] != 'u');
			n = n + 1;
		}
		System.out.println("Consoantes= "+n);
		
	}

}
