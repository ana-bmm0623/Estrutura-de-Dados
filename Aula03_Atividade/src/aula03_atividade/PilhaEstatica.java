package aula03_atividade;

public class PilhaEstatica {

	private Integer[] array;
	private int topo = -1;

	public PilhaEstatica(int tamanho) {
		array = new Integer[tamanho];
	}

	public void push(int valor) {
		if (!verificarSePilhaEstaCheia()) {
			topo++;
			array[topo] = valor;
		} else {
			System.out.println("Pilha está cheia!");
		}
	}

	public void pop() {
		if (!verificarSePilhaEstaVazia()) {
			array[topo] = null;
			topo--;
		} else {
			System.out.println("Pilha está vazia!");
		}
	}

	public int verificarTamanhoPilha() {
		return topo + 1;
	}

	public boolean verificarSePilhaEstaVazia() {
		return topo == -1;
	}

	public boolean verificarSePilhaEstaCheia() {
		return topo == array.length - 1;
	}
}