package aula01_Ex1;

public class Aula01_Ex1 {
	public int somaDosAnteriores(int x) {
		if (x == 1) {
			return 1;
		} else {

			return x + somaDosAnteriores(x - 1);
		}
	}

	public static void main(String[] args) {
		Aula01_Ex1 b = new Aula01_Ex1();

		int resultado = b.somaDosAnteriores(5);
		System.out.println("Resultado: " + resultado);
	}
}