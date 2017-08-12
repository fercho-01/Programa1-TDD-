package com.udea.calculadora;

import java.util.List;

import com.udea.lista.ListaLigada;

public class Calculadora {
	
	public static float calcularPromedio(ListaLigada numeros){
		if(numeros.cantidad>0){
			float promedio = numeros.RetornarSuma()/numeros.cantidad;
			System.out.println(promedio);
			return promedio;
		}else{
			return 0;
		}
	}
}
