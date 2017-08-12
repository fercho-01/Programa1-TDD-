package com.udea.archivo;

import com.udea.lista.ListaLigada;
import java.io.*;


public class LectorArchivo 
{
	File archivo;
	FileReader fr;
	BufferedReader br;
	ListaLigada datos;
	
	public ListaLigada CrearArchivo(String url){
	  
		 archivo = null;
	     fr = null;
	     br = null;
		 datos = new ListaLigada();
		 
	     try {
	        archivo = new File (""+ url);
	        fr = new FileReader (archivo);
	        br = new BufferedReader(fr);
	
	        // Lectura del fichero
	        String linea;
	        while((linea=br.readLine())!=null){
	            float nodo = Float.ParseFloat(linea);
	        	datos.AgregarNodo(nodo);
	        }
	     }
	     catch(Exception e){
	        e.printStackTrace();
	     }finally{
	        // En el finally cerramos el fichero, para asegurarnos
	        // que se cierra tanto si todo va bien como si salta 
	        // una excepcion.
	        try{                    
	           if( null != fr ){   
	              fr.close();     
	           }                  
	        }catch (Exception e2){ 
	           e2.printStackTrace();
	        }
	     }
	     return datos;
	}
}