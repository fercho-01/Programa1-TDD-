package com.udea.lista;

public class ListaLigada 
{
	public Nodo cabeza;
	public int	cantidad;
	public Nodo ultimo;
	
	float suma;

	public ListaLigada(float n)
	{
		cabeza = new Nodo(n);
		ultimo = cabeza;
		cantidad = 1;
	}
	
	public ListaLigada()
	{
		cabeza = null;
		ultimo = cabeza;
		cantidad = 0;
	}

	public void AgregarNodo(float n)
	{
		Nodo nNodo = new Nodo(n);
		suma += n;
		
		//nNodo.AsignarSiguiente(ultimo);
		if (cantidad == 0)
		{
			cabeza = nNodo;
			ultimo = nNodo;
		}else{
			ultimo.AsignarSiguiente(nNodo);
			ultimo=nNodo;
		}
		
		cantidad ++;
	}
	
	public float RetornarSuma()
	{
		return suma;
	}
	
	public int RetornarCantidad()
	{
		return cantidad;
	}
	
	
}
