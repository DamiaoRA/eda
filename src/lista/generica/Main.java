package lista.generica;

public class Main {
	public static void main(String[] args) {
		List<String> list = new DoublyLinkedList<String>();
		list.insertBegin("p2");
		list.insertBegin("p1");
		list.insertEnd("p3");
		list.insert("px", 1);
		list.print();
		System.out.println(list.size());

		//
		List<Integer> listInt = new DoublyLinkedList<Integer>();
		listInt.insertBegin(2);
		listInt.insertBegin(1);
		listInt.insertEnd(3);
		list.insert(99, 1);
		listInt.print();
		System.out.println(listInt.size());
	}
}