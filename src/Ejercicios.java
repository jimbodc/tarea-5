
public class Ejercicios
{
	//Devuelve el valor de mi_arreglo en la posicion [columna][fila]
	static String obtenerValor(String mi_arreglo[][], int columna, int fila)
	{
		
		return mi_arreglo[columna][fila];
	}
	
	//Devuelve la cantidad de columnas de mi_arreglo
	static int obtenerCantidadColumnas(double mi_arreglo[][])
	{
	// utilizamos La función length que devuelve la longitud de un arreglo en un entero

		return mi_arreglo.length;
	}
	
	//Devuelve la cantidad de filas de mi_arreglo
	static int obtenerCantidadFilas(double mi_arreglo[][])
	{
		//volvemo a utilizar la funcion length para que nos devuelva la cantidad de filas
		return mi_arreglo[0].length;
	}
	
	//Devuelve la cantidad de elementos que puede alacenar mi_arreglo
	static int obtenerCantidadElementos(double mi_arreglo[][])
	{
		//utilizamos double para realizar la suma de los numeros reales de elementos
		double suma = 0; 
		 		//creamos la variable elemento dentro del ciclo for 
		 		for(int elemento = 0; elemento < mi_arreglo.length; elemento++) 
		 		{ 
		 			//la suma de los elementos sera igual a suma anteriomente declarada en 0 mas mi arreglo
		 			suma = suma + mi_arreglo[elemento].length; 
		 		} 
		 		 //nos devuelve la variable tipo int suma 
			return (int)suma; 

	}
	
	//Devuelve la suma de todos los elementos de mi_arreglo
	static double sumaElementos(double mi_arreglo[][])
	{
		 
		 		double sumaElementos = 0; //inicializamos en cero la varible suma 
		 		
		 		//utilizamos dos ciclos for para hacer la suma de los elementos  
		 		for(int elementos = 0; elementos < mi_arreglo.length; elementos++) 
		 		{ 
		 			for(int elementos2 = 0; elementos2 < mi_arreglo[elementos].length; elementos2++) 
		 			{ 
		 				sumaElementos = sumaElementos + mi_arreglo[elementos][elementos2]; 
		 			} 
		 		} 
		 		 
		 		return sumaElementos; 

	}
	
	//Devuelve el promedio de todos los elementos de mi_arreglo
	static double promedioElementos(double mi_arreglo[][])
	{
		 
				double suma = 0; 
		 		double promedioElementos = 0; 
		 		 
		 		for(int columna = 0; columna < mi_arreglo.length; columna++) 
		 		{ 
		 			for(int fila = 0; fila < mi_arreglo[columna].length; fila++) 
		 			{ 
		 				suma = suma + mi_arreglo[columna][fila]; 
		 				 
		 			} 
		 			//utilizamos el ciclo for dentro de el ciclo for columnas esta el de filas.
		 			//hacemos la suma mi_arreglo mas promedio por columnas
		 			promedioElementos = promedioElementos + mi_arreglo[columna].length; 
		 		} 
		 		 
		 		return suma / promedioElementos; 

	}
	
	//Devuelve verdadero si num esta en mi_arreglo, de lo contrario devuelve false
	static boolean existe(double mi_arreglo[][], int num)
	{
		
		//utilizamos boolean entonces retornara un verdadero o falso , creamos el arreglo 
		for(int fila = 0; fila < mi_arreglo.length; fila++) 
			 		{ 
			 			for(int columna = 0; columna < mi_arreglo[fila].length; columna++) 
			 			{ 
			 				// creamos la condicion si se cumple rertorna verdadero sino falso
			 				if(mi_arreglo[fila][columna] == num) 
			 				{ 
			 					return true; 
			 				} 
			 			} 
			 		} 
		 

		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
