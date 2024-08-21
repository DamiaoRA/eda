package fila;

import fila.exception.FilaCheiaException;
import fila.exception.FilaVaziaException;

public class MainFila {
	public static void main(String[] args) throws FilaCheiaException, FilaVaziaException {
		EDAFilaEstatica fila = new EDAFilaEstatica(10);
		
		fila.enfileirar(1);
		fila.enfileirar(4);
		fila.enfileirar(0);
		fila.enfileirar(6);
		fila.desenfileirar();
		fila.enfileirar(fila.desenfileirar());
		fila.enfileirar(3);
		fila.desenfileirar();
		fila.enfileirar(2);
		fila.enfileirar(3);
		fila.desenfileirar();
		fila.enfileirar(4);
		
		fila.imprimir();
	}
}