package com.udea.calculadora;

import static org.junit.Assert.*;
import org.junit.Test;

import com.udea.archivo.LectorArchivo;
import com.udea.lista.ListaLigada;

public class ListaTest 
{
	@Test
	public void TestLista()
	{
		ListaLigada nLista = new ListaLigada();
		assertTrue(nLista.cantidad == 0);
	}
	
	@Test
	public void TestLista2()
	{
		ListaLigada nLista = new ListaLigada(2f);
		assertTrue(nLista.cantidad == 1);
	}

	@Test
	public void TestLista3()
	{
		ListaLigada nLista = new ListaLigada(2f);
		nLista.AgregarNodo(3f);
		assertTrue(nLista.cantidad == 2);
	}
	@Test
	public void TestArchivo()
	{
		LectorArchivo nLector = new LectorArchivo();
		ListaLigada nLista = nLector.CrearArchivo("C:\\Users\\LENOVO\\Desktop\\texto.txt");
		System.out.println(nLista.RetornarSuma());
		assertTrue(nLista.RetornarSuma() == 12);
	}
}
