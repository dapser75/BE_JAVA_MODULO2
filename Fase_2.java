package modulo_2;
/*
 * FASE 2
 * Canvia la taula per una llista (List<Character>)
 * Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONTANT’.
 * Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’.

 */

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Fase_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char vocal []= {'a','e','i','o','u'};
		
		List<Character> nombre = new ArrayList<Character>();
		String name=JOptionPane.showInputDialog("Introduce tu nombre: ");//Entrada por teclado del nombre
		for (int i=0;i<name.length();i++) { //Bucle para rellenar la lista con el nombre.
			nombre.add(i, name.charAt(i));	
		}
		//Bucle para recorrer la lista para verificar caracteres
		for (int i=0;i<nombre.size();i++) {
			boolean control=true;
			if (Character.isAlphabetic(nombre.get(i)) || nombre.get(i) == ' '){//Verificar que el caracter sea una letra o espacio (nombre compuestos).
			for (int n=0;n<5;n++){ 
					if(nombre.get(i).equals(vocal[n])){
						System.out.println(nombre.get(i) + " VOCAL.");
						control=false;
					}
				}
				if (control) System.out.println(nombre.get(i) + " CONSONANTE.");	
							
			}else if (Character.isDigit(nombre.get(i))){ //Controlar si el caracter es un numeros.
				System.out.println("El nombre no puede tener numeros. Caracter introducido: "+ nombre.get(i) );
									
			}else { //En caso de que sean caracteres especiales (@,",etc)
				System.out.println("El nombre no puede tener carcateres especiales.");
			}
				
		}
	}
	
	
}
