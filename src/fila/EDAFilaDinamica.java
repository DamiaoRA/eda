package fila;

import fila.exception.FilaCheiaException;
import fila.exception.FilaVaziaException;
import lista.EDANo;

public class EDAFilaDinamica implements EDAFilaIF {
	
	private EDANo inicio;

	@Override
	public void enfileirar(int e) throws FilaCheiaException {
		EDANo no = new EDANo(e);
		if(isVazia()) {
			inicio = no;
		} else {
			EDANo ultimo = inicio;
			while(ultimo.getProximo() != null)
				ultimo = ultimo.getProximo();
			ultimo.setProximo(no);
		}
	}

	@Override
	public int desenfileirar() throws FilaVaziaException {
		if (isVazia())
			throw new FilaVaziaException();

		int lixo = inicio.getDado();
		inicio = inicio.getProximo();
		return lixo;
	}

	@Override
	public int quantidade() {
		int count = 0;
		EDANo aux = inicio;
		while (aux  != null) {
			count++;
			aux = aux.getProximo();
		}
		return count;
	}

	@Override
	public boolean isCheia() {
		return false;
	}

	@Override
	public boolean isVazia() {
		return inicio == null;
	}

	@Override
	public void imprimir() {
		EDANo aux = inicio;
		while (aux  != null) {
			System.out.print(aux.getDado() + " ");
			aux = aux.getProximo();
		}
		System.out.println();
	}
}