/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizaciondecodigo;

import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.equipos.Computadora;
import ico.fes.herencia.Alumno;
import ico.fes.iu.MiVentana;

/**
 *
 * @author emycr
 */
public class ReutilizacionDeCodigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String facultad = new String("FES Aragón");
        char letra = facultad.charAt(4); 
        System.out.println(letra);  
        
       // MiVentana v1 = new MiVentana();
        Computadora compu=new Computadora();
        compu.setMarca("Asus");
        compu.setModelo("VivoBook 2");
        compu.setCpu( new Procesador("Intel", "i9" , 5.0f) );
       
        Mouse raton= new Mouse();
        raton.setMarca("Logitech");
        compu.setRaton(raton); 

        compu.getRaton().setModelo("GS400");



        ///Monitor marca Samsung, 45" y LED
        
        compu.setPantalla(new Monitor("Samsung", "LED", 45f));
        System.out.println( compu ); 
        compu.getPantalla().setMarca("LG");
         System.out.println( compu );   

        System.out.println("-----Herencia-----");
        Alumno alu1 = new Alumno(); 
        alu1.setNombre("José");
        System.out.println(alu1);

        Alumno alu2 = new Alumno("3191821-1", "Derecho", 2, "Mario", 20);
        System.out.println( alu2 );
    }
}
