package primeiroPrograma;

public class main {

	public static void main(String[] args) {
		
		int x, y;
		String[] palavras = new String[]{"Morango", "Uva", "Laranja"};
		
		x = 5;
		y = 10;
		
		int soma = x + y;
		
		System.out.println(soma);
		for (int i=0; i<palavras.length; i++) {
			System.out.print(palavras[i] + " ");
		}

	}

}
