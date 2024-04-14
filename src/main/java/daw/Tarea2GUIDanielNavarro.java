/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

import javax.swing.JFrame;

/**
 *
 * @author daniel
 */
public class Tarea2GUIDanielNavarro {

    public static void main(String[] args) {
       
        
          JFrame frame = new JFrame("App");
        frame.setSize(800,600);
	// La ventana no se puede redimensionar
	frame.setResizable(false);
	// Posición de la ventana
    	frame.setLocationRelativeTo(null);
	// Incluimos el panel en la ventana         	       
        frame.add(new boton());
       // Ajusta el frame al contenido
        frame.pack();
	// Hacemos visible la ventana
    	frame.setVisible(true);
	//Acción por defecto al pulsar el botón de cierre de la ventana
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
