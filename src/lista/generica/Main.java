package lista.generica;

import lista.exception.ListaIndiceForaLimiteException;

public class Main {
	public static void main(String[] args) throws ListaIndiceForaLimiteException {
		List<String> list = new DoublyLinkedList<String>();
		list.insertBegin("p2");
		list.insertBegin("p1");
		list.insertEnd("p3");
		list.insert("px", 1);
		list.print(); //p1 px p2 p3
		System.out.println(list.size());
		list.removeBegin();
		list.removeEnd();
		list.print();// px p2 

		//
		List<Integer> listInt = new DoublyLinkedList<Integer>();
		listInt.insertBegin(2);
		listInt.insertBegin(1);
		listInt.insertEnd(3);
		listInt.insert(99, 1);
		listInt.print();
		System.out.println(listInt.size());
		listInt.removeBegin();
		listInt.removeEnd();
		listInt.print();
	}
}