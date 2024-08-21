package lista;

import lista.exception.ListaCheiaException;
import lista.exception.ListaIndiceForaLimiteException;
import lista.exception.ListaVaziaException;

public class EDAListaEstatica implements EDAListaIF{
	
	private int array[];
	private int quantidade;
	
	public EDAListaEstatica (int tamanho) {
		array = new int[tamanho];
		quantidade = 0;
	}

	@Override
	public void inserirNoFinal(int e) throws ListaCheiaException {
		if (isCheio())
			throw new ListaCheiaException();

		array[quantidade++] = e;
	}

	@Override
	public void inserirNoComeco(int e) throws ListaCheiaException {
		if (isCheio())
			throw new ListaCheiaException();
		
		//shift right
		for (int i = quantidade; i > 0; i--) {
			array[i] = array[i - 1];
		}
		
		array[0] = e;
		quantidade++;
	}

	@Override
	public int removerDoFinal() throws ListaVaziaException {
		if (isVazia())
			throw new ListaVaziaException();

		return array[--quantidade];
	}

	@Override
	public int removerDoInicio() throws ListaVaziaException {
		if (isVazia())
			throw new ListaVaziaException();

		int lixo = array[0];
		//shift left
		for (int i = 0; i < quantidade - 1; i++) {
			array[i] = array[i+1];
		}
		
		quantidade--;
		return lixo;
	}

	@Override
	public int remover(int i) {
		if (i < 0 || i >= quantidade)
			return 0;

		int lixo = array[i];
		if (i != quantidade - 1) {
			for (int j = i; j < quantidade - 1; j++) {
				array[j] = array[j+1];
			}
		}
		quantidade--;
		return lixo;
	}

	@Override
	public void imprimir() {
		System.out.print("Início -> ");
		for (int i = 0; i < quantidade ; i++) {
			if (i == quantidade -1)
				System.out.print(array[i]);
			else
				System.out.print(array[i] + ", ");
		}
		System.out.print(" <- Fim\n");
	}

	@Override
	public boolean isCheio() {
		return quantidade == array.length;
	}

	@Override
	public boolean isVazia() {
		return quantidade == 0;
	}

	@Override
	public int buscar(int e) {
		for (int i = 0; i < quantidade; i++) {
			if(array[i] == e)
				return i;
		}
		return -1;
	}

	@Override
	public void inserir(int e, int i) throws ListaIndiceForaLimiteException {
		if(i >= array.length)
			throw new ListaIndiceForaLimiteException();

		for (int j = quantidade; j >= i; j--) {
			array[j] = array[j-1];
		}
		array[i] = e;
		quantidade++;
	}

	@Override
	public int quantidade() {
		return quantidade;
	}
}