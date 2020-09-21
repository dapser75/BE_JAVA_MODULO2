package modulo_2;
/* FASE 1
 * Crea una taula (char[]) amb el teu nom on cada posició correspongui a una lletra.
 * Fes un bucle que recorri aquesta taula i mostri per consola cadascuna de les lletres
*/

import javax.swing.JOptionPane;

class Fase_1 {
	//Declaración de variables
	private char nombre[]= {'D','A','N','I','E','L',' ','A','R','I','Z','U'};
	private String name="";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char[] getNombre() {
		return nombre;
	}

	public void setNombre(char[] nombre) {
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaración de variables
		Fase_1 d=new Fase_1();
		
			//Imprimir caracter a caracter, recorriendo bucle FOR
			for (int i=0;i<d.getNombre().length;i++) {
				System.out.println(d.getNombre()[i]);
				
			}
		
			System.out.println("\n" + "Prueba entrada nombre por teclado");
			//Prueba personal para hacer la entrada por comandos
			d.setName(JOptionPane.showInputDialog("Introduce tu nombre: "));
			d.setNombre(d.name.toCharArray());//Conversión de string a Array
			//Imprimir caracter a caracter, recorriendo bucle FOR
			for (int i=0; i< d.getNombre().length;i++) {
				System.out.print(d.getNombre()[i]+ " ");
								
			}
	}

}
