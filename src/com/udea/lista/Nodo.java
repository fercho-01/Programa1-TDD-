package com.udea.lista;

public class Nodo 
{
	public float valor;
	public Nodo anterior;
	public Nodo siguiente;
	
	public Nodo(float n)
	{
		valor 		= n;
		anterior 	= null;
		siguiente 	= null;
	}
	
	public void AsignarSiguiente(Nodo s)
	{
		siguiente = s;
	}
	
	public void AsignarAnterior(Nodo a) 
	{
		anterior = a;
	}
	
	public float RetornarValor()
	{
		return (valor);
	}
}
