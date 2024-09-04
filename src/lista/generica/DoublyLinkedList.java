package lista.generica;

import lista.exception.ListaIndiceForaLimiteException;

/**
 * Lista duplamente encadeada com Nó descritor
 * 
 * @param <T>
 */
public class DoublyLinkedList<T> implements List<T>{
	//Nó descritor
	private SentinelNo<T> sentinelNo;

	public DoublyLinkedList() {
		sentinelNo = new SentinelNo<T>();
	}

	@Override
	public void insertEnd(T e) {
		No<T> no = new No<T>();
		no.setData(e);

		if(sentinelNo.getSize() > 0) {
			no.setPrev(sentinelNo.getEnd());
			sentinelNo.getEnd().setNext(no);
		}

		sentinelNo.setEnd(no);
		sentinelNo.addSize();

		if (size() == 1) {
			sentinelNo.setBegin(no);
		}
	}

	@Override
	public void insertBegin(T e) {
		No<T> no = new No<T>();
		no.setData(e);

		if(sentinelNo.getSize() > 0) { 
			sentinelNo.getBegin().setPrev(no);
			no.setNext(sentinelNo.getBegin());
		}
		sentinelNo.setBegin(no);
		sentinelNo.addSize();

		if (size() == 1) {
			sentinelNo.setEnd(no);
		}
	}

	@Override
	public void print() {
		No<T> temp = sentinelNo.getBegin();
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	@Override
	public int size() {
		return sentinelNo.getSize();
	}


	@Override
	public void insert(T e, int i) throws ListaIndiceForaLimiteException {
		if (i > sentinelNo.getSize() || i < 0)
			throw new ListaIndiceForaLimiteException();

		if (i == 0 ) {
			insertBegin(e);
			return;
		}

		if (i == sentinelNo.getSize() ) {
			insertEnd(e);
			return;
		}

		int count = 0;
		No<T> aux = sentinelNo.getBegin();
		while (count != i) {
			aux = aux.getNext();
			count++;
		}

		No<T> no = new No<T>();
		no.setData(e);
		no.setNext(aux);
		no.setPrev(aux.getPrev());

		aux.getPrev().setNext(no);
		aux.setPrev(no);
		sentinelNo.addSize();
	}

	@Override
	public T removeBegin() {
		No<T> e = sentinelNo.getBegin();
		sentinelNo.setBegin(e.getNext());
		sentinelNo.decSize();
		e.getNext().setPrev(null);
		return e.getData();
	}

	@Override
	public T removeEnd() {
		No<T> e = sentinelNo.getEnd();
		sentinelNo.setEnd(e.getPrev());
		sentinelNo.decSize();
		e.getPrev().setNext(null);
		return e.getData();
	}
}