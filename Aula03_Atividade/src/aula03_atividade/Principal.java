package aula03_atividade;

public class Principal {
	public static void main(String[] args) {
		PilhaEstatica pilha = new PilhaEstatica(5);

		System.out.println("Pilha está vazia? " + pilha.verificarSePilhaEstaVazia());

		pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		pilha.push(40);
		pilha.push(50);

		System.out.println("Tamanho da pilha após inserções: " + pilha.verificarTamanhoPilha());

		System.out.println("Pilha está cheia? " + pilha.verificarSePilhaEstaCheia());

		pilha.pop();

		System.out.println("Tamanho da pilha após um pop: " + pilha.verificarTamanhoPilha());
		System.out.println("Pilha está cheia? " + pilha.verificarSePilhaEstaCheia());
	}
}
