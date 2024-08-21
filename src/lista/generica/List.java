package lista.generica;

public interface List<T> {
	public void insertEnd(T e);
	
	public void insertBegin(T e);

	public int size();

	public void print();
}
