package lista;

import lista.exception.ListaCheiaException;
import lista.exception.ListaIndiceForaLimiteException;
import lista.exception.ListaVaziaException;

public class EDAListaEncadeada implements EDAListaIF {

	private EDANo inicio;

	@Override
	public void inserirNoFinal(int e) throws ListaCheiaException {
		EDANo no = new EDANo(e);

		if(isVazia()) {
			inicio = no;
		} else {
			EDANo auxiliar = inicio;
			while(auxiliar.getProximo() != null) {
				auxiliar = auxiliar.getProximo();
			}
	
			auxiliar.setProximo(no);
		}
	}

	@Override
	public void inserirNoComeco(int e) throws ListaCheiaException {
		EDANo no = new EDANo(e);
		if(isVazia()) {
			inicio = no;
		} else {
			no.setProximo(inicio);
			inicio = no;
		}
	}

	@Override
	public void inserir(int e, int i) throws ListaIndiceForaLimiteException {
		if (i >= quantidade() || i < 0) {
			throw new ListaIndiceForaLimiteException();
		}

		EDANo no = new EDANo(e);
		if(isVazia()) {
			inicio = no;
			return;
		}

		if(i == 0) {
			no.setProximo(inicio.getProximo());
			inicio = no;
			return;
		}

		EDANo aux = inicio;
		for (int j = 1; j < i; j++) {
			aux = aux.getProximo();
		}

		no.setProximo(aux.getProximo());
		aux.setProximo(no);
	}

	@Override
	public int removerDoFinal() throws ListaVaziaException {
		if (isVazia())
			throw new ListaVaziaException();
		
		if (quantidade() == 1) {
			int dado = inicio.getDado();
			inicio = null;
			return dado;
		} else {
			EDANo lixo = inicio;
			int quantidade = quantidade();
			for (int i = 0; i < quantidade - 1; i++) {
				lixo = lixo.getProximo();
			}
	
			int dado = lixo.getProximo().getDado();
			lixo.setProximo(null);
	
			return dado;
		}
	}

	@Override
	public int removerDoInicio() throws ListaVaziaException {
		if (isVazia())
			throw new ListaVaziaException();

		int dado = inicio.getDado();
		inicio = inicio.getProximo();

		return dado;
	}

	@Override
	public int remover(int i) {
		if (i < 0)
			return 0;

		EDANo anterior = null;
		EDANo lixo = inicio;
		int contador = 0;
		while (lixo != null && contador != i) {
			anterior = lixo;
			lixo = lixo.getProximo();
			contador++;
		}

		if(lixo == null)
			return 0;

		if(anterior == null) {
			inicio = inicio.getProximo();
			return lixo.getDado();
		}

		anterior.setProximo(lixo.getProximo());
		return lixo.getDado();
	}

	@Override
	public void imprimir() {
		System.out.print("Início -> ");
		EDANo aux = inicio;
		while(aux != null) {
			System.out.print(aux.getDado() + " ");
			aux = aux.getProximo();
		}
		System.out.print(" <- Fim\n");
	}

	@Override
	public boolean isCheio() {
		return false;
	}

	@Override
	public boolean isVazia() {
		return inicio == null;
	}

	@Override
	public int buscar(int e) {
		EDANo temp = inicio;
		int i = 0;
		while (temp != null) {
			if (temp.getDado() == e)
				return i;
			temp = temp.getProximo();
			i++;
		}

		return -1;
	}

	@Override
	public int quantidade() {
		int quantidade = 0;
		
		EDANo aux = inicio;
		while (aux.getProximo() != null) {
			quantidade++;
			aux = aux.getProximo();
		}
		return quantidade;
	}
}