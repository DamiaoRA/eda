package lista.generica;

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
}