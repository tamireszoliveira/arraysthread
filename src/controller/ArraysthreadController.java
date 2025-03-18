package controller;
import java.util.Random;
public class ArraysthreadController {
	private int[][] matriz;
	
	
	public void matriz(int linhas, int colunas) {
		matriz = new int[linhas][colunas];
		Random random = new Random();
		for(int i = 0; i< linhas; i++) {
			for(int j = 0; j< colunas; j++) {
				matriz[i][j] = random.nextInt();
			}
		}
	}
	
	// exibição
	public void exibirMatriz() {
		for (int[] linha : matriz) {
			for(int num: linha) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
	
	// metodo p criar threads e calcular a soma de cada linha
	public void soma() {
		for(int i =0; i< matriz.length; i++) {
			final int linhaIndex = i;  //indice da linha (necessário para uso dentro da lambda)
			Thread thread = new Thread(() -> {
				int soma = 0;
			for(int num : matriz[linhaIndex]) {
				soma+= num;
			}
			System.out.println("Linha " + linhaIndex + ": Soma = " + soma);
		});
			thread.start();
		}
	}
	
}
	
