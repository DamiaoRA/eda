package lista.generica;

public class No<T> {
	private T data;
	private No<T> prev;
	private No<T> next;

	public No<T> getPrev() {
		return prev;
	}
	public void setPrev(No<T> prev) {
		this.prev = prev;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public No<T> getNext() {
		return next;
	}
	public void setNext(No<T> next) {
		this.next = next;
	}
}