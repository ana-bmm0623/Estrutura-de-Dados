package aplicacao;

import modelo.ListaEncadeada;

public class Principal {
	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();

		lista.adicionar("A");
		lista.adicionar("B");
		lista.adicionar("C");
		lista.adicionar("D");
		lista.imprimirLista();

	}
}
