package controiller;

public class QuickSort {
	public static void quicksort(int[]vetor, int inicio, int fim) {
		int pontEsq=inicio+1;
		int pontDir=fim;
		if(inicio < fim) {
			while(pontEsq<pontDir) {
				while(vetor[pontEsq]<=vetor[inicio]&&pontEsq<pontDir) {
					pontEsq++;
				}
				while(vetor[pontDir]>vetor[inicio]&&pontEsq<=pontDir) {
					pontDir--;
				}
				if(pontEsq<pontDir) {
					troca(vetor, pontEsq, pontDir);
					pontEsq++;
					pontDir--;
				}
			}
			//a
			troca(vetor, inicio, pontDir);
			quicksort(vetor, inicio, pontDir-1);
			quicksort(vetor, pontDir+1, fim);
		}
	}

	private static void troca(int[] vet, int pos1, int pos2) {
		int buffer = vet[pos1];
		vet[pos1] = vet[pos2];
		vet[pos2] = buffer;
		}
}
