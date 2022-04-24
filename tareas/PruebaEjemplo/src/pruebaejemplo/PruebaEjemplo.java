/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author emycr
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuentahabiente[] lista = new Cuentahabiente[5];
        lista [0] = new Cuentahabiente("CINMF1993", "Emiliano", 45264f);
        lista [1] = new Cuentahabiente("JKNV20193", "José Antonio", 55000f);
        lista [2] = new Cuentahabiente("SNFI29032", "Sofia", 32159f);
        lista [3] = new Cuentahabiente("IKJNSD322", "Isabella", 98256f);
        lista [4] = new Cuentahabiente("XSDOIF203", "Rosa", 1052269);
        
        for (Cuentahabiente cuentahabiente : lista) {
            System.out.println(cuentahabiente);
            cuentahabiente.evaluarNivelCliente();
            System.out.println("-------------");
            
        }
        
        
    }
    
}
