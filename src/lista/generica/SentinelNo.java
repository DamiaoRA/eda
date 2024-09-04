package lista.generica;

public class SentinelNo<T> {
	private int size;
	private No<T> begin;
	private No<T> end;

	public SentinelNo(){
		size = 0;
	}

	public int addSize() {
		return ++size;
	}

	public int decSize() {
		if(size > 0)
			--size;
		return size;
	}
	

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public No<T> getBegin() {
		return begin;
	}

	public void setBegin(No<T> begin) {
		this.begin = begin;
	}

	public No<T> getEnd() {
		return end;
	}

	public void setEnd(No<T> end) {
		this.end = end;
	}
}