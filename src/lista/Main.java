package lista;


import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

import lista.exception.ListaCheiaException;
import lista.exception.ListaIndiceForaLimiteException;
import lista.exception.ListaVaziaException;

public class Main {
	
//	public static void main(String[] args) throws ListaCheiaException, ListaVaziaException {
//		EDAListaEstatica lista = new EDAListaEstatica(5);
//		lista.inserirNoFinal(10);
//		lista.inserirNoFinal(5);
//		lista.inserirNoFinal(40);
//		lista.inserirNoFinal(30);
//		lista.imprimir();
//		
//		lista.inserirNoComeco(87);
//		lista.imprimir();
//		
//		lista.removerDoFinal();
//		lista.imprimir();
//		
//		lista.removerDoInicio();
//		lista.imprimir();
//		
//	}
	
	public static void main(String[] args) throws ListaCheiaException, ListaVaziaException, ListaIndiceForaLimiteException {
		
		EDANo p = new EDANo(5);
		p.setProximo(new EDANo(70));
		p.getProximo().setProximo(new EDANo(4));
		p.getProximo().getProximo().setProximo(new EDANo(31));
		p.getProximo().getProximo().setDado(12);
		p.getProximo().getProximo().getProximo().setProximo(new EDANo(42));
		
		EDANo lixo = p;
		while (lixo != null) {
			System.out.println(lixo.getDado());
			lixo = lixo.getProximo();
		}
		
//		EDAListaIF lista = criarLista();	
//
//		lista.inserirNoFinal(10);
//		lista.inserirNoFinal(5);
//		lista.inserirNoFinal(40);
//		lista.inserirNoFinal(30);
//		lista.inserir(99, 2);
//		lista.imprimir();
//		lista.remover(1);
//		lista.imprimir();
//		System.out.println(lista.buscar(40));
//
//		lista.inserirNoComeco(87);
//		lista.imprimir();
//		
//		lista.removerDoFinal();
//		lista.imprimir();
//		
//		lista.removerDoInicio();
//		lista.imprimir();
//
//		lista.inserirNoFinal(2003);
//		lista.imprimir();
	}

	private static EDAListaIF criarLista() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o tipo:\n1-estática\n2-dinâmica\n");
		String tipo = scanner.nextLine();
		try {
			if (tipo.equals("1")) {
				System.out.print("Informe o tamanho da lista estática: ");
				String tamanho = scanner.nextLine();
				return new EDAListaEstatica(Integer.parseInt(tamanho));
			} else {
				return new EDAListaEncadeada();
			}
		} finally {
			scanner.close();
		}
	}
}