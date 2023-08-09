package aula01_Ex2;

public class Aula01_Ex2 {
	public int fibonacci(int n) {
		if (n == 1) {
			return 0;
		} else if (n == 2) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static void main(String[] args) {
		Aula01_Ex2 a = new Aula01_Ex2();

		int resultado = a.fibonacci(5);
		System.out.println("Resultado: " + resultado);
	}
}
