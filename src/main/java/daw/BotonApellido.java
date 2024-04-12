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
public class BotonApellido extends JPanel  implements ActionListener{

    private JButton botonApellido;
  
   
    private JTextArea textoApellido;

    public BotonApellido() {
        initComponents();
    }

    private void initComponents() {
        // Tamaño del panel
        this.setPreferredSize(new Dimension(600, 200));

        // Borde del panel
        this.setBorder(new TitledBorder("Borde del panel"));

        // Creamos el botón, con un texto a mostrar
        
        botonApellido = new JButton("apellido");
        

        // Creamos el textArea de una fila por 25 columnas
        
        textoApellido = new JTextArea(1, 25);

        // Establecemos el color de fondo del textArea
       
        textoApellido.setBackground(Color.red);

        // Posicionamiento de componentes con FlowLayout
        this.setLayout(new FlowLayout());

        // Añadimos los componentes al panel
        
        this.add(botonApellido);
        this.add(textoApellido);

       
        botonApellido.addActionListener(this);

        

    }
    
    @Override
        // Sobrescribimos el método de la interfaz
       public void actionPerformed(ActionEvent ae) {

		
		// Este ejemplo es tan básico que no hemos usado el objeto ae
                // Indicamos el texto que queremos mostrar en el área de texto

                textoApellido.setText("Navarro");
        }

}
