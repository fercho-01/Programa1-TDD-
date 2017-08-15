package com.udea.calculadora;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.udea.lista.ListaLigada;

public class CalculadoraDesviacionEstandarTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDesviacionListaVacia() {
		float valor = Calculadora.calcularDesviacionEstandar(null);
		assert(0==valor);
	}
	
	@Test
	public void testDesviacionListaVacia2(){
		ListaLigada numeros = new ListaLigada();
		float valor = Calculadora.calcularDesviacionEstandar(numeros);
	}
	
	@Test
	public void testDesviacionUnElemento(){
		ListaLigada numeros = new ListaLigada();
		float valor = Calculadora.calcularDesviacionEstandar(numeros);
		assert(0==valor);
	}
	
	@Test
	public void testDesviacionDosNumeros(){
		ListaLigada numeros = new ListaLigada();
		numeros.AgregarNodo(-1);
		numeros.AgregarNodo(10);
		
		float valor = Calculadora.calcularDesviacionEstandar(numeros);
		assert(7.7781744f==valor);
	}
	
	@Test
	public void testDesviacionVariosNumerosPositivos(){
		ListaLigada numeros = new ListaLigada();
		numeros.AgregarNodo(186);
		numeros.AgregarNodo(699);
		numeros.AgregarNodo(132);
		numeros.AgregarNodo(272);
		numeros.AgregarNodo(291);
		numeros.AgregarNodo(331);
		numeros.AgregarNodo(199);
		numeros.AgregarNodo(1890);
		numeros.AgregarNodo(788);
		numeros.AgregarNodo(1601);
		float valor = Calculadora.calcularDesviacionEstandar(numeros);
		assert(625.634f==valor);
	}
	
	@Test
	public void testDesviacionVariosNumerosNegativos(){
		ListaLigada numeros = new ListaLigada();
		numeros.AgregarNodo(-1);
		numeros.AgregarNodo(-4);
		numeros.AgregarNodo(-7);
		numeros.AgregarNodo(0);
		
		float valor = Calculadora.calcularDesviacionEstandar(numeros);
		assert(3.1622777f==valor);
	}
	
	@Test
	public void testDesviacionVariosNumerosPositivosNegativos(){
		ListaLigada numeros = new ListaLigada();
		numeros.AgregarNodo(-1);
		numeros.AgregarNodo(10);
		numeros.AgregarNodo(-7);
		numeros.AgregarNodo(0);
		numeros.AgregarNodo(12);
		
		float valor = Calculadora.calcularDesviacionEstandar(numeros);

		assert(7.981228f==valor);
	}

}
