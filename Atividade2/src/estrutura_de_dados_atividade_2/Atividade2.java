package estrutura_de_dados_atividade_2;

import java.util.Arrays;

public class Atividade2 {

	// Método para inserir uma informação no array, sempre no primeiro índice vazio.
	public void InserirDadosSemOIndice(int[] array, int valor) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				array[i] = valor;
				break;
			}
		}
	}

	// Método para inserir uma informação no array, informando qual o índice.
	public void InserirDadosComIndice(int[] array, int valor, int indice) {
		for (int i = 0; i < array.length; i++) {
			if (i == indice) {
				array[i] = valor;
				break;
			}
		}
	}

	// Método para alterar uma informação no array.
	public void AlterarOsDados(int[] array, int valor, int indice) {
		for (int i = 0; i < array.length; i++) {
			if (i == indice) {
				array[i] = valor;
				break;
			}
		}
	}

	// Método para listar as informações do array.
	public void ListarArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}
}
