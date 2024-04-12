/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;

/**
 *
 * @author daniel
 */
public class boton extends JPanel  implements ActionListener{


    private JButton botonNombre,botonApellidos;
    private JTextArea textoNombre,textoApellidos;
   

    public boton() {
        initComponents();
    }

    private void initComponents() {
        // Tamaño del panel
        this.setPreferredSize(new Dimension(600, 200));

        // Borde del panel
        this.setBorder(new TitledBorder("Borde del panel"));

        // Creamos el botón, con un texto a mostrar
        botonNombre = new JButton("nombre");
        botonApellidos = new JButton("apellidos");
        

        // Creamos el textArea de una fila por 25 columnas
        textoNombre = new JTextArea(1, 25);
        textoApellidos = new JTextArea(1, 25);
     

        // Establecemos el color de fondo del textArea
        textoNombre.setBackground(Color.cyan);
        
        // Posicionamiento de componentes con FlowLayout
        this.setLayout(new FlowLayout());

        // Añadimos los componentes al panel
        this.add(botonNombre);
        this.add(textoNombre);
        this.add(botonApellidos);
        this.add(textoApellidos);
      

        botonNombre.addActionListener(this);
        botonApellidos.addActionListener(this);

        

    }
    
    @Override
        // Sobrescribimos el método de la interfaz
       public void actionPerformed(ActionEvent ae) {

		
		// Este ejemplo es tan básico que no hemos usado el objeto ae
                // Indicamos el texto que queremos mostrar en el área de texto

                if((ae.getSource()==botonNombre)){
                    textoNombre.setText("Daniel");
                }
    		if((ae.getSource()==botonApellidos)){
                    textoApellidos.setText("Navarro");
                }
                
                
        }

}
