package lista.generica;

import lista.exception.ListaIndiceForaLimiteException;

public interface List<T> {
	public void insert(T e, int i) throws ListaIndiceForaLimiteException ;

	public void insertEnd(T e);

	public void insertBegin(T e);

	public int size();

	public void print();

	public T removeBegin();

	public T removeEnd();
}