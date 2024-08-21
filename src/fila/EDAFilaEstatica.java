package fila;

import fila.exception.FilaCheiaException;
import fila.exception.FilaVaziaException;

public class EDAFilaEstatica implements EDAFilaIF {
	
	private int array[];
	private int inicio = -1;

	public EDAFilaEstatica(int tamanho) {
		array = new int[tamanho];
	}

	@Override
	public void enfileirar(int e) throws FilaCheiaException {
		if(isCheia())
			throw new FilaCheiaException();

		array[++inicio] = e;
	}

	@Override
	public int desenfileirar() throws FilaVaziaException {
		if(isVazia())
			throw new FilaVaziaException();

		int dado = array[0];
		//shift
		for(int i = 0; i < inicio; i++) {
			array[i] = array[i+1];
		}
		inicio--;

		return dado;
	}

	@Override
	public int quantidade() {
		return inicio + 1;
	}

	@Override
	public boolean isCheia() {
		return inicio == array.length - 1;
	}

	@Override
	public boolean isVazia() {
		return inicio < 0;
	}

	@Override
	public void imprimir() {
		System.out.print("Primeiro -> ");
		for (int i = 0; i < quantidade() ; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print(" <- Último\n");
	}

}
