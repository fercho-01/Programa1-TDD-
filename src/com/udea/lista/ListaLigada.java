package com.udea.lista;

public class ListaLigada 
{
	public Nodo cabeza;
	public int	cantidad;
	public Nodo ultimo;

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
		nNodo.AsignarSiguiente(ultimo);
		if (cantidad == 0)
		{
			cabeza = nNodo;
		}else{
			ultimo.AsignarSiguiente(nNodo);
		}
		
		cantidad ++;
	}
	
	public float RetornarSuma()
	{
		float resultado = cabeza.valor;
		Nodo flotante = cabeza;
		do {
			flotante 	 = 	flotante.siguiente;
			resultado 	+= 	flotante.valor;
		}while(flotante!=ultimo);
		
		return resultado;
	}
	
	public int RetornarCantidad()
	{
		return cantidad;
	}
	
	
}
