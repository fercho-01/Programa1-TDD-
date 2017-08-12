package com.udea.lista;

public class ListaLigada 
{
	public Nodo cabeza;
	
	public Nodo ultimo;
	
	public ListaLigada(float n)
	{
		cabeza = new Nodo(n);
		ultimo = cabeza;
	}
	
	public void AgregarNodo(float n)
	{
		Nodo nNodo = new Nodo(n);
		nNodo.AsignarSiguiente(ultimo);
		ultimo.AsignarSiguiente(nNodo);
	}
}
