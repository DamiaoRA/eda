package pilha;

import lista.EDANo;
import pilha.exception.PilhaCheiaException;
import pilha.exception.PilhaVaziaException;

public class EDAPilhaEncadeada implements EDAPilhaIF{

	private EDANo topo;

	@Override
	public void push(int e) throws PilhaCheiaException {
		EDANo no = new EDANo(e);
		if(isVazia()) {
			topo = no;
		} else {
			no.setProximo(topo);
			topo = no;
		}
	}

	@Override
	public int pop() throws PilhaVaziaException {
		if (isVazia())
			throw new PilhaVaziaException();

		int dado = topo.getDado();
		topo = topo.getProximo();

		return dado;
	}

	@Override
	public int top() throws PilhaVaziaException {
		if (isVazia())
			throw new PilhaVaziaException();

		return topo.getDado();
	}

	@Override
	public boolean isCheia() {
		return false;
	}

	@Override
	public boolean isVazia() {
		return topo == null;
	}

	@Override
	public int quantidade() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void imprimir() {
		System.out.print("Topo -> ");
		EDANo aux = topo;
		while(aux != null) {
			System.out.print(aux.getDado() + " ");
			aux = aux.getProximo();
		}
		System.out.print(" <- Base\n");
	}
}