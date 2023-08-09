package aula01_Fatorial;

public class Aula01_Fatorial {
	public int fatorial(int base) {
		if(base == 1) {
			return 1;
		}else {
			return base * fatorial(base - 1);
		}
	}
	
	public static void main(String[] args) {
		Aula01_Fatorial a = new Aula01_Fatorial();
		
		int resultadoFatorial = a.fatorial(5);
		System.out.println("Fatorial: " + resultadoFatorial);
	}}
