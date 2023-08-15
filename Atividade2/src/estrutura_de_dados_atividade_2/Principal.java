package estrutura_de_dados_atividade_2;

public class Principal {

	public static void main(String[] args) {

		Atividade2 a = new Atividade2();
		int[] arr = { 3, 0, 0 };

		a.InserirDadosSemOIndice(arr, 4);
		a.ListarArray(arr);

		a.InserirDadosComIndice(arr, 6, 1);
		a.ListarArray(arr);

		a.AlterarOsDados(arr, 1, 2);
		a.ListarArray(arr);
	}

}
