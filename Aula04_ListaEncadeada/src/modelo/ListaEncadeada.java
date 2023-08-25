package modelo;

public class ListaEncadeada {
	private No primeiroNo;
	private No ultimoNo;
	private int tamanho;

	public ListaEncadeada() {
		this.setPrimeiroNo(null);
		this.setUltimoNo(null);
	}

	public void adicionar(String elemento) {
		No novoNo = new No(elemento);
		if (getTamanho() == 0) {
			this.setPrimeiroNo(novoNo);
		} else {
			this.ultimoNo.setProximo(novoNo);
		}
		this.setUltimoNo(novoNo);
		this.tamanho++;
	}

	public int getTamanho() {
		return this.tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public No getUltimoNo() {
		return ultimoNo;
	}

	public void setUltimoNo(No ultimoNo) {
		this.ultimoNo = ultimoNo;
	}

	public No getPrimeiroNo() {
		return primeiroNo;
	}

	public void setPrimeiroNo(No primeiroNo) {
		this.primeiroNo = primeiroNo;
	}

	public void imprimirLista() {
		No noAuxiliar = this.primeiroNo;
		System.out.println(noAuxiliar.getElemento());
		while (noAuxiliar.getProximo() != null) {
			noAuxiliar = noAuxiliar.getProximo();
			System.out.println(noAuxiliar.getElemento());
		}

	}

}
