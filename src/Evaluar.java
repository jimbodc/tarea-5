import static org.junit.Assert.*;

import org.junit.Test;


public class Evaluar {
	double arr[][]={{1,2,3,4},{10,20,30,40},{100,200,300,400}};
	double arr2[][]={{1,2},{10,20},{100,200},{1000,2000}};
	
	@Test
	public void obtenerValor() {
		String arr[][]={{"1","2","3","4"},{"10","20","30","40"}};
		assertEquals("Error ejecutando obtenerValor({1,2,3},1)", "30", Ejercicios.obtenerValor(arr,1,2));
	}
	
	@Test
	public void obtenerCantidadColumnas() {
		assertEquals("Error ejecutando obtenerValor({1,2,3},1)", 3, Ejercicios.obtenerCantidadColumnas(arr));
		assertEquals("Error ejecutando obtenerValor({1,2,3},1)", 4, Ejercicios.obtenerCantidadColumnas(arr2));
	}
	
	@Test
	public void obtenerCantidadFilas() {
		assertEquals("Error ejecutando obtenerValor({1,2,3},1)", 4, Ejercicios.obtenerCantidadFilas(arr));
		assertEquals("Error ejecutando obtenerValor({1,2,3},1)", 2, Ejercicios.obtenerCantidadFilas(arr2));
	}
	
	@Test
	public void obtenerCantidadElementos() {
		assertEquals("Error ejecutando obtenerValor({1,2,3},1)", 12, Ejercicios.obtenerCantidadElementos(arr));
		assertEquals("Error ejecutando obtenerValor({1,2,3},1)", 8, Ejercicios.obtenerCantidadElementos(arr2));
	}
	
	@Test
	public void sumaElementos() {
		assertEquals("Error ejecutando obtenerValor({1,2,3},1)", (int)1110, (int)Ejercicios.sumaElementos(arr));
		assertEquals("Error ejecutando obtenerValor({1,2,3},1)", (int)3333, (int)Ejercicios.sumaElementos(arr2));
	}
	
	@Test
	public void promedioElementos() {
		assertEquals("Error ejecutando obtenerValor({1,2,3},1)", (int)92, (int)Ejercicios.promedioElementos(arr));
		assertEquals("Error ejecutando obtenerValor({1,2,3},1)", (int)416, (int)Ejercicios.promedioElementos(arr2));
	}
	
	@Test
	public void existe() {
		assertEquals("Error ejecutando obtenerValor({1,2,3},1)", true, Ejercicios.existe(arr,30));
		assertEquals("Error ejecutando obtenerValor({1,2,3},1)", true, Ejercicios.existe(arr,100));
		assertEquals("Error ejecutando obtenerValor({1,2,3},1)", true, Ejercicios.existe(arr,300));
		assertEquals("Error ejecutando obtenerValor({1,2,3},1)", false, Ejercicios.existe(arr,5));
		assertEquals("Error ejecutando obtenerValor({1,2,3},1)", true, Ejercicios.existe(arr2,20));
		assertEquals("Error ejecutando obtenerValor({1,2,3},1)", true, Ejercicios.existe(arr2,100));
		assertEquals("Error ejecutando obtenerValor({1,2,3},1)", true, Ejercicios.existe(arr2,2000));
		assertEquals("Error ejecutando obtenerValor({1,2,3},1)", false, Ejercicios.existe(arr2,30));
	}

}
