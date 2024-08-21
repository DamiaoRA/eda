package fila;

import fila.exception.FilaCheiaException;
import fila.exception.FilaVaziaException;

public interface EDAFilaIF {
	
	public void enfileirar(int e) throws FilaCheiaException;
	
	public int desenfileirar() throws FilaVaziaException;
	
	public int quantidade();
	
	public boolean isCheia();
	
	public boolean isVazia();
	
	public void imprimir();
}
