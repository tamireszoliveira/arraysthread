package view;
import controller.ArraysthreadController;
public class ArraysthreadMain {

	public static void main(String[] args) {
	
	
		
		ArraysthreadController controller = new ArraysthreadController();
		controller.matriz(3, 5);
		controller.exibirMatriz();
		
		//calcular as somas
		
		controller.soma();
	}	
}


