package aula2;

public class Ex1 {
	public int somaValorVetor(int posicao, int[] vetor) {
		if (posicao == vetor.length - 1) {
			return vetor[posicao];
		}else{
			return vetor[posicao] + somaValorVetor(posicao + 1, vetor) + somaValorVetor(posicao + 1, vetor);
		}
	

	}

	public static void main(String[] args) {
		int[] vetor = new int[4];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = i++ + 5;
		}

		Ex1 r = new Ex1();

		int resultado = r.somaValorVetor(0, vetor);

		System.out.println("Soma dos valores: " + resultado);
	}
}
