/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu.swing;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author emycr
 */
public class VentanaSwing extends JFrame{
    private FlowLayout layout; 
    private JTextField cuadroTexto; 
    private JButton boton; 
    private JLabel resultado; 
    private JComboBox<String> lista; 
    
    
    
    public VentanaSwing() throws HeadlessException {
        this.setTitle("Miventana Swing");
        this.setSize(300,220);
        this.setVisible(true);
        layout = new FlowLayout(); 
        this.setLayout(layout);
        boton = new JButton("Convertir a F: "); 
        resultado = new JLabel("Grados F: "); 
        lista = new JComboBox<String>(); 
        //Usando DefaultComboBoxModel
        lista.addItem("Rojo");
        lista.addItem("Verde");
        lista.addItem("Azul");
        lista.addItem("Blanco");
        
        
        cuadroTexto= new JTextField(15);
        this.getContentPane().add(cuadroTexto); 
        this.getContentPane().add(boton); 
        this.getContentPane().add(resultado); 
        this.getContentPane().add(lista); 
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
                //Al siguiente le hará falta manejo de excepciones 
                float centigrados = Float.parseFloat(cuadroTexto.getText()); 
                float farenheit = (centigrados *(9.0f/5.0f))+ 32.0f; 
                resultado.setText(farenheit+ " °F");
            }
        });
        
        this.lista.addItemListener(new ItemAdapter() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Cambio el item");
                System.out.println( e.getItem() );
            }
            
        });
        
       
    }
    
}
