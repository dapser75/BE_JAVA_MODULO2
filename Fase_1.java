package modulo_2;
/* FASE 1
 * Crea una taula (char[]) amb el teu nom on cada posició correspongui a una lletra.
 * Fes un bucle que recorri aquesta taula i mostri per consola cadascuna de les lletres
*/

import javax.swing.JOptionPane;

class Fase_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Declaración de variables
			char nombre[]= {'D','A','N','I','E','L',' ','A','R','I','Z','U'};
			//Imprimir caracter a caracter, recorriendo bucle FOR
			for (int i=0;i<nombre.length;i++) {
				System.out.println(nombre[i]);
				
			}
			//Prueba personal para hacer la entrada por comandos
			String name=JOptionPane.showInputDialog("Introduce tu nombre: ");
			System.out.print("\n");
			char [] nom=name.toCharArray(); //Conversión de string a Array
			for (int i=0;i<nom.length;i++) {
				System.out.print(nom[i]+ " ");
								
			}
		}

}
