/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cifradocesar;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



/**
 *
 * @author emycr
 */
public class VentanaCesar extends JFrame{
        private JButton boton;
        private JTextField cuadroTexto; 
        private JTextField cuadroTexto2; 
        private JTextField cuadroTexto3; 
        private JLabel etiqueta; 
        private JLabel etiqueta2; 
        private FlowLayout layout; 

    public VentanaCesar() throws HeadlessException {
        this.setTitle("Ventana Cesar");
        this.setSize(500,500);
        this.setVisible(true);
        layout = new FlowLayout(); 
        this.setLayout(layout);
        boton = new JButton("Cifrar"); 
        etiqueta = new JLabel("Key");
        etiqueta2 = new JLabel("Mensaje");
        cuadroTexto= new JTextField(10);
        cuadroTexto2= new JTextField(50);
        cuadroTexto3= new JTextField(50);
        
        
        this.getContentPane().add(etiqueta);
        this.getContentPane().add(cuadroTexto);
        this.getContentPane().add(etiqueta2);
        this.getContentPane().add(cuadroTexto2);         
        this.getContentPane().add(boton); 
        this.getContentPane().add(cuadroTexto3);
        this.pack();
        this.setVisible(true);
              
       
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
                //((JFrame)e.getSource()).setVisible(false); 
            }
        });
        
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String letras1= "ABCDEFGHIJKMNÑSOPQRSTUVWXYZ";
                String clave = cuadroTexto2.getText();
                char letras[] = clave.toCharArray();
                for (int i = 0; i < letras.length; i++) {
                    letras[i] =(char)(letras[i]+(char)1);
                }
                String cif = String.valueOf(letras); 
                cuadroTexto3.setText(cif);
               }                       
       });
                       
              
    }
}


        
        
        
                
    }
    
    
    
    
}
