package fila;

import fila.exception.FilaCheiaException;
import fila.exception.FilaVaziaException;

public class MainFila {
	public static void main(String[] args) throws FilaCheiaException, FilaVaziaException {
//		EDAFilaIF fila = new EDAFilaEstatica(10);
		EDAFilaIF fila = new EDAFilaDinamica();

		fila.enfileirar(1);
		fila.enfileirar(4);
		fila.enfileirar(0);
		fila.enfileirar(6);
		fila.imprimir();//1 4 0 6

		fila.desenfileirar(); 
		fila.imprimir();//4 0 6

		fila.enfileirar(fila.desenfileirar()); 
		fila.imprimir();//0 6 4

		fila.enfileirar(3); //0 6 4 3
		fila.desenfileirar(); //6 4 3
		fila.enfileirar(2); //6 4 3 2
		fila.enfileirar(3); //6 4 3 2 3
		fila.desenfileirar(); //4 3 2 3 
		fila.enfileirar(4); //4 3 2 3 4  
		
		fila.imprimir();
	}
}