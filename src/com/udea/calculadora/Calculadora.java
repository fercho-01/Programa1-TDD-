package com.udea.calculadora;

import java.util.List;

import com.udea.lista.ListaLigada;
import com.udea.lista.Nodo;

public class Calculadora {
	
	public static float calcularPromedio(ListaLigada numeros){
		try{
			
		if(numeros.cantidad>0){
			float promedio = numeros.RetornarSuma()/numeros.cantidad;
			System.out.println(promedio);
			return promedio;
		}else{
			return 0;
		}
		}catch(Exception e){
			return 0;
		}
	}
	
	public static float calcularDesviacionEstandar(ListaLigada numeros){
		if(numeros==null){
			return 0;
		}
		if(numeros.cantidad==0){
			return 0;
		}
		
		boolean continuar = true;
		Nodo nodo = numeros.cabeza;
		float sumatoria = 0;
		float promedio = numeros.RetornarSuma()/numeros.cantidad;
		//System.out.println(":: "+promedio);
		while(continuar){

			sumatoria += (float) Math.pow(nodo.valor-promedio, 2);
//			System.out.println(sumatoria);
			nodo=nodo.siguiente;
			if(nodo == numeros.ultimo){
//				System.out.println("entro");
				continuar=false;
			}
			
		}
		
		sumatoria += (float) Math.pow(nodo.valor-promedio, 2);
		
		System.out.println(sumatoria);
		
		sumatoria = sumatoria/(numeros.cantidad -1);
		
		
		float desviacion = (float) Math.sqrt(sumatoria);
		return desviacion;
	}
}
