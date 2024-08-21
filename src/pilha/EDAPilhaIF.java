package pilha;

import pilha.exception.PilhaCheiaException;
import pilha.exception.PilhaVaziaException;

public interface EDAPilhaIF {
	
	public void push(int e) throws PilhaCheiaException;
	
	public int pop() throws PilhaVaziaException;
	
	public int top() throws PilhaVaziaException;
	
	public boolean isCheia();
	
	public boolean isVazia();
	
	public int quantidade();
	
	public void imprimir();

}