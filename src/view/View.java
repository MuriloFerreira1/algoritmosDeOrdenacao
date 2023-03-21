package view;

public class View {

	public static void main(String[] args) {
		int vet[] = {12, 13, 14, 15, 51, 53, 57, 25, 26, 27, 90};
		int fim = vet.length-1;
		controiller.QuickSort.quicksort(vet, 0, fim);
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i]+", ");
		}
	}

}
