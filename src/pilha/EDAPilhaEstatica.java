package pilha;

import pilha.exception.PilhaCheiaException;
import pilha.exception.PilhaVaziaException;

public class EDAPilhaEstatica implements EDAPilhaIF {

	private int[] array;
	private int topo = -1;

	public EDAPilhaEstatica(int tamanho) {
		array = new int[tamanho];
	}

	@Override
	public void push(int e) throws PilhaCheiaException {
		if(isCheia())
			throw new PilhaCheiaException();

		array[++topo] = e;
	}

	@Override
	public int pop() throws PilhaVaziaException {
		if(isVazia())
			throw new PilhaVaziaException();

		return array[topo--];
	}

	@Override
	public int top() throws PilhaVaziaException {
		if(isVazia())
			throw new PilhaVaziaException();

		return array[topo];
	}

	@Override
	public boolean isCheia() {
		return topo == array.length -1;
	}

	@Override
	public boolean isVazia() {
		return topo < 0;
	}

	@Override
	public int quantidade() {
		return topo + 1;
	}

	@Override
	public void imprimir() {
		System.out.print("Topo ->");
		for(int i = topo; i >= 0; i--) {
			System.out.print(array[i] + ",");
		}
		System.out.print("<- Base\n");
	}
}