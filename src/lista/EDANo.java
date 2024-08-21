package lista;

public class EDANo {
	
	private int dado;
	private EDANo proximo;

	public EDANo(int dado) {
		this.dado = dado;
	}

	public int getDado() {
		return dado;
	}
	public void setDado(int dado) {
		this.dado = dado;
	}
	public EDANo getProximo() {
		return proximo;
	}
	public void setProximo(EDANo proximo) {
		this.proximo = proximo;
	}
}