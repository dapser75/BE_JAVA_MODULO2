package modulo_2;
/*
 * FASE 3
 * Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen. 

 */

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Fase_3 {

	public static void main(String[] args) {
		Map <Character, Integer> lista_car = new HashMap<Character,Integer>();//Declaración del mapa
				
		String name=JOptionPane.showInputDialog("Introduce tu nombre: ");//Entrada por teclado del nombre
		for (int i=0;i<name.length();i++) { //Bucle para rellenar la lista con el nombre.
			if (lista_car.containsKey(name.charAt(i))) {//Verificamos si la letra que vamos a introducir en el mapa.
				int n=lista_car.get(name.charAt(i));//variable para controlar numero de veces que aparece una 
				lista_car.put(name.charAt(i), n+1); // Almacenamos la letra en el mapa e incrementamos el contador
				
			}else {
				
				lista_car.put(name.charAt(i),1); //Introducir la letra en caso que no está repetida
			}
		}
		//Recorrer el map para imprimir su contenido
		for (Character valorK : lista_car.keySet()){
			System.out.println(valorK + " " + lista_car.get(valorK));
			
		}
		
		System.out.println(lista_car.values());
		System.out.println(lista_car.size());
	}
	
	
}
