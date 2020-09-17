package modulo_2;

/*
 * FASE 4
 * Crea una altra llista amb el teu cognom on cada posició correspongui a una lletra.
 * Fusiona les dues llistes en una sola. A més, afegeix una posició amb un espai buit entre la primera i la segona. És a dir, partim de la llista name i surname i al acabar l’execució només tindrem una que es dirà fullName.
 * FullName: [‘N’, ‘A’, ‘M’, ‘E’, ‘ ‘, ‘S’, ‘U’, ‘R‘, ‘N’, ‘A’, ‘M’, ‘E’]
 * 
 */

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Fase_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> nombre = new ArrayList<Character>();
		List<Character> apellido = new ArrayList<Character>();
		List<Character> fullname = new ArrayList<Character>();
		String name=JOptionPane.showInputDialog("Introduce tu nombre: ");
		for (int i=0;i<name.length();i++) { //Bucle para rellenar la lista con el nombre.
			nombre.add(i, name.charAt(i));
		}
				String surname=JOptionPane.showInputDialog("Introduce tu apellido: ");
		for (int i=0;i<surname.length();i++) { //Bucle para rellenar la lista con el apellido.
			apellido.add(i, surname.charAt(i));	
		}
		
	//	List<Character> fullname = new ArrayList(nombre + ' '+ apellido);
		//Ahora pasaremos unificar las dos llistas en una
		fullname.addAll(nombre);
		fullname.add(' ');
		fullname.addAll(apellido);
		for (int i=0; i< fullname.size();i++){
			System.out.print(fullname.get(i));
		}
		System.out.print('\r');//Introducir retorno de carro

		//Vaciamos las listas
		nombre.clear();
		apellido.clear();
		//Verificar por pantalla el tamaño de las listas de nombres y apellidos
		System.out.println("El tamaño de la lista nombre es: " + nombre.size());
		System.out.println("El tamaño de la lista apellido es: " + apellido.size());
		
		
	}

}
