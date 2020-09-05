package fibonacci;

public class fibonacci {

	public static void main(String[] args) {

		int vezes = 10; //pode ser alterado e até catputado pelo teclado (via user)
		
		for (int cont = 0, proximo = 0, anterior = 1; cont < vezes; cont++) {
			System.out.print(proximo + " ");
			proximo = proximo + anterior;
			anterior = proximo - anterior;
		}

	}

}
