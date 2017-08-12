package com.udea.calculadora;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.udea.lista.ListaLigada;

public class CalculadoraTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMedia() {
		ListaLigada numeros = new ListaLigada();
		float valor = Calculadora.calcularPromedio(numeros);
		
		
	}

}
