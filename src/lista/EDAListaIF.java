package lista;

import lista.exception.ListaCheiaException;
import lista.exception.ListaIndiceForaLimiteException;
import lista.exception.ListaVaziaException;

public interface EDAListaIF {
	
	public void inserirNoFinal(int e) throws ListaCheiaException;
	
	public void inserirNoComeco(int e) throws ListaCheiaException;
	
	public void inserir (int e, int i) throws ListaIndiceForaLimiteException;
	
	public int removerDoFinal() throws ListaVaziaException;
	
	public int removerDoInicio() throws ListaVaziaException;
	
	public int remover(int i);
	
	public void imprimir();
	
	public boolean isCheio();
	
	public boolean isVazia();

	public int buscar(int e);
	
	public int quantidade();
}