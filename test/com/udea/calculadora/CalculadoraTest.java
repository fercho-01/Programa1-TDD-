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
	public void testMediaListaVacia() {
		ListaLigada numeros = new ListaLigada();
		float valor = Calculadora.calcularPromedio(numeros);
		assertTrue(0==valor);	
	}
	
	@Test
	public void testMediaUnNumero(){
		ListaLigada numeros = new ListaLigada();
		numeros.AgregarNodo(2);
		float valor = Calculadora.calcularPromedio(numeros);
		assertTrue(2==valor);
	}
	
	@Test
	public void testMediaUnNumeroNegativo(){
		ListaLigada numeros = new ListaLigada();
		numeros.AgregarNodo(-2);
		float valor = Calculadora.calcularPromedio(numeros);
		assertTrue(-2==valor);
	}
	
	@Test
	public void testMediaUNCero(){
		ListaLigada numeros = new ListaLigada();
		numeros.AgregarNodo(0);
		float valor = Calculadora.calcularPromedio(numeros);
		assertTrue(0==valor);
	}
	
	@Test
	public void testMediaUnNumero2(){
		ListaLigada numeros = new ListaLigada();
		numeros.AgregarNodo(3);
		float valor = Calculadora.calcularPromedio(numeros);
		assertTrue(3==valor);
	}
	
	@Test
	public void testMediaVariosNumeros(){
		ListaLigada numeros = new ListaLigada();
		numeros.AgregarNodo(2);
		numeros.AgregarNodo(3);
		numeros.AgregarNodo(7);
		
		float valor = Calculadora.calcularPromedio(numeros);
		System.out.println(valor);
		assertTrue(4f==valor);
	}
	
	@Test
	public void testMediaVariosNumerosNegativos(){
		ListaLigada numeros = new ListaLigada();
		numeros.AgregarNodo(-2);
		numeros.AgregarNodo(-3);
		numeros.AgregarNodo(-7);
		
		float valor = Calculadora.calcularPromedio(numeros);
		assertTrue(-4==valor);
	}
	
	@Test
	public void testMediaVariosNumerosNegativosPositivosCero(){
		ListaLigada numeros = new ListaLigada();
		numeros.AgregarNodo(-2);
		numeros.AgregarNodo(3);
		numeros.AgregarNodo(-7);
		numeros.AgregarNodo(0);
		
		float valor = Calculadora.calcularPromedio(numeros);
		assertTrue(-1.5==valor);
	}
	
	

}
