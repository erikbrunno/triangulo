package br.com.b2w.triangulo;

public class Triangulo {

	public static int calcularMaioSomaTriangulo(int[][] matrizTriangular) {
		validarTriangulo(matrizTriangular);
		return calcular(matrizTriangular);
	}

	private static int calcular(int[][] matrizTriangular) {
		for (int linha = matrizTriangular.length - 2; linha >= 0; linha--) {
			for (int col = 0; col <= linha; col++) {
				int somaAEsquerda = matrizTriangular[linha][col] + matrizTriangular[linha + 1][col];
				int somaADireita = matrizTriangular[linha][col] + matrizTriangular[linha + 1][col + 1];
				
 				matrizTriangular[linha][col] = (somaAEsquerda > somaADireita) ? somaAEsquerda : somaADireita;
			}
		}

		return matrizTriangular[0][0];
	}

	private static void validarTriangulo(int[][] matrizTriangular) {
		if (!isTrianguloValido(matrizTriangular)) {
			throw new IllegalArgumentException("Não representa um triângulo");
		}
	}

	private static boolean isTrianguloValido(int[][] matrizTriangular) {
		boolean retorno = true;
		int itensPorLinha = 1;
		for (int row = 0; row < matrizTriangular.length; row++) {
			if (matrizTriangular[row].length != itensPorLinha) {
				retorno = false;
				break;
			}
			itensPorLinha++;
		}
		return retorno;
	}
}
