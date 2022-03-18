/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.composicion;

import componente.Libro;
import libro.componentes.Autor;
import libro.componentes.Editorial;

/**
 *
 * @author emycr
 */
public class TareaComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Libro libro= new Libro();
    libro.setTitulo("Las Avententuras");
    libro.setPaginas(364);
    libro.setDueño(new Autor("Emiliano", 35));
    libro.setEmpresa(new Editorial("Castillo", "Mexicana"));
    
        System.out.println(libro);

    }
    
}
