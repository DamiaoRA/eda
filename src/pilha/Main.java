package pilha;

import pilha.exception.PilhaCheiaException;
import pilha.exception.PilhaVaziaException;

public class Main {
//	public static void main(String[] args) throws PilhaCheiaException, PilhaVaziaException {
//		EDAPilhaEstatica pilha = new EDAPilhaEstatica(10);
//
//		pilha.push(1);
//		pilha.push(4);
//		pilha.push(0);
//		pilha.push(6);
//		pilha.imprimir();
//		
//		pilha.pop();
//		pilha.imprimir();
//		
//		pilha.push(pilha.top());
//		pilha.imprimir();
//		
//		pilha.push(3);
//		pilha.pop();
//		pilha.push(2);
//		pilha.push(3);
//		pilha.pop();
//		pilha.push(4);
//
//		pilha.imprimir();
//	}
	
//	Topo ->6,0,4,1,<- Base
//	Topo ->0,4,1,<- Base
//	Topo ->0,0,4,1,<- Base
//	Topo ->4,2,0,0,4,1,<- Base
	
	public static void main(String[] args) throws PilhaCheiaException, PilhaVaziaException {
		EDAPilhaEncadeada pilha = new EDAPilhaEncadeada();

		pilha.push(1);
		pilha.push(4);
		pilha.push(0);
		pilha.push(6);
		pilha.imprimir();
		
		pilha.pop();
		pilha.imprimir();
		
		pilha.push(pilha.top());
		pilha.imprimir();
		
		pilha.push(3);
		pilha.pop();
		pilha.push(2);
		pilha.push(3);
		pilha.pop();
		pilha.push(4);

		pilha.imprimir();
	}
}
