package br.com.b2w.triangulo;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCaseTriangulo {

	private Triangulo triangulo;

	@Before
	public void setUp() {
		this.triangulo = new Triangulo();
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTrianguloInvalidoTresLinhas() {
		int[][] matrizTriangular = { { 1, 3 }, { 9, 5 }, { 4, 3, 5 } };

		triangulo.calcularMaioSomaTriangulo(matrizTriangular);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTrianguloInvalidoQuatroLinhas() {
		int[][] matrizTriangular = { { 1 }, { 9, 7, 5 }, { 3, 5, 7 }, { 8, 4, 3, 9 } };

		triangulo.calcularMaioSomaTriangulo(matrizTriangular);
	}

	@Test
	public void testTrianguloTresLinhas() {
		int[][] matrizTriangular = { { 3 }, { 7, 4 }, { 2, 4, 6 } };

		int resposta = triangulo.calcularMaioSomaTriangulo(matrizTriangular);
		assertEquals(14, resposta);
	}

	@Test
	public void testTrianguloQuatroLinhas() {
		int[][] matrizTriangular = { { 6 }, { 3, 5 }, { 9, 7, 1 }, { 4, 6, 8, 4 } };

		int resposta = triangulo.calcularMaioSomaTriangulo(matrizTriangular);
		assertEquals(26, resposta);
	}

}
