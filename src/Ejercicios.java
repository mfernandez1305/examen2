import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicios {
	
	//Devuelve true si todos los elementos de 'mi_lista' son pares, de lo contrario devuelve false
	static boolean sonPares(ArrayList<Integer> mi_lista)
	{
		
		return false;
	}
	
	//Devuelve el numero menor almacenado en 'mi_lista'
	static int getMenor(ArrayList<Integer> mi_lista)
	{
		
		return -1;
	}
	
	//Devuelve el numero menor de un archivo
	//Dado, el archivo unicamente contiene enteros
	static int getNumeroMayor(String nombre_archivo)
	{
		
		int mayor=0;//declaramos la variable mayor
		try {//intenta
			
			Scanner s= new Scanner (nombre_archivo);//creamos el scanner que buscara los datos del archivo 
		
			while(s.hasNext()){//iniciamos el ciclo
				int num=s.nextInt();//revisa cada  linea del archivo
				if(num>mayor)//evalua si num es mayor que la variable mayor
					mayor=num;//iguala las variables 
			}	
			System.out.print("el mayor es: " +mayor);//imprime el numero mayor
		}catch (Exception e){//atrapa los errores
			e.printStackTrace();//imprime los errores 
		}
		return mayor;//devuelve el mayor 
		}


	//Devuelve cuantas veces existe la string buscada en el archivo con nombre nombre_archivo
	static int cuantasVecesExiste(String nombre_archivo, String buscada)
	{
	
	int existe=0;//declaramos la variable
		try{
			FileReader leer=new FileReader(nombre_archivo);//creamos el lector
			BufferedReader buffer=new BufferedReader(leer);
			while(buffer.equals(buscada)){//iniciamos el ciclo
			existe=0+1;	//sumamos las veces que existe
			}
		
		}catch(Exception e){//atrapamos el arror
			e.printStackTrace();//imprime el error
		}
		return existe;//devuelve existe
		//obtuve ayuda de :http://www.youtube.com/watch?v=V2B8XW3-dck
	}
	}
