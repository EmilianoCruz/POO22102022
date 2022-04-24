/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author emycr
 */
public class Cuentahabiente {
    private String idCliente; 
    private String nombre; 
    private float balance; 

    public Cuentahabiente() {
    }

    public Cuentahabiente(String idCliente, String nombre, float balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cuentahabiente:\n" + "idCliente:" + idCliente + "\nnombre:" + nombre + "\nbalance:" + balance;
    }
    
    public void retirarDinero( float monto){
        float Total = balance-monto; 
    }
    
    public String evaluarNivelCliente(){
        String res = ""; 
        res = (balance<=50000)?"Cliente Regular":"Cliente Premium"; 
        System.out.println("Eres: "+res);     
        return null;   
    }
    
}
