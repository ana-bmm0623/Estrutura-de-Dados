package aula01_Potenciacao;

public class Aula01_Potenciacao {
	public int potencia(int base, int expoente) {
		if(expoente == 0)
			return 1;
		else {
			expoente -= 1;
			return base * potencia(base, expoente);
		}
	}
	
	public static void main(String[] args) {
		Aula01_Potenciacao c = new Aula01_Potenciacao();
		
		int resultPotencia = c.potencia( 2, 8);
		System.out.println("Potencia: " + resultPotencia);
	}
}
