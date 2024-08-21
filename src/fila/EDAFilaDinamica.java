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
			//TODO
			//for
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
		// TODO Auto-generated method stub
		return 0;
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
		// TODO Auto-generated method stub
	}
}