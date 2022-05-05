/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author emycr
 */
public class JavaBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad=22; 
        Integer edad2 = new Integer(2);
        float x = edad2.floatValue(); 
        System.out.println(x);
        String dias = "23";
        System.out.println(dias);
        int temp = Integer.parseInt(dias);
        System.out.println("Dias = "+(temp+3));
        
        
        
        Perro dog1= new Perro("Poodle", 1); 
        System.out.println(dog1);
        System.out.println( Perro.cola );
        System.out.println(dog1.cola);
        
        Perro.ladrar();
        dog1.ladrar();
        
        String res = ""; 
        /**if(edad<=18){
            res="Mayor de edada"; 
        }else{
            res = "Menor de edad"; 
        }
        
        System.out.println("eres: "+res);
        */
        System.out.println("------");
        res = (edad<=18)?"Mayor de edad":"Menor de edad";
        System.out.println("Eres: "+ res);
        
        
        int  val1 = 7;
        int  val2 = 2;
        System.out.println( val1 | val2);
        System.out.println( val1 & val2);
        /*
        val1 = 000...0001
        val2 = 000...0010
       
        */
        //desplpazamiento a nivel de bits
        int val3 = 1; 
        int val4 = val3<<1;
        
        System.out.println(val4);
        val4 = val4<<1;
        System.out.println(val4);
        val4 = val4>>1;
        System.out.println(val4);
        
        System.out.println("---- arreglos ----");
        
        int [] edades; //aqui solo se declara
        int [] edades2 = new int[5];// aqui se declara y reserva memoria
        int [] edades3 = {22,21,18,19,18}; // en este, se declara,reserva e inicializa
        
        edades2[0]=33; 
        System.out.println(edades2[0]);// 33
        System.out.println(edades2[1]);// 0
        System.out.println("Edades 3 a mano: ");// 
        System.out.println(edades3[0]);// 
        System.out.println(edades3[1]);// 
        System.out.println(edades3[2]);// 
        System.out.println(edades3[3]);// 
        System.out.println(edades3[4]);// 
        
        System.out.println("AUTOMATIZADO");
        for (int i = 0; i < edades3.length; i++) {
            System.out.println(edades3[i]);
        }
        System.out.println("orden inverso ");
        for (int i = edades3.length-1; i >= 0; i--) {
            System.out.println(edades3[i]);
        }
        
        System.out.println("eades a 18");
        for (int i = 0; i < edades3.length; i++) {
            edades3[i] = edades3[2];
            System.out.println(edades3[i]);
        }
        /*
        for Each es un for espaecial, introducido en la version 2 de Java.
        El objetivo del For each es simplificar la forma de recorrer arreglos 
        fore + tecla tabulador

        */
        System.out.println("con for each: ");
        for (int ed : edades3) {
            System.out.println( ed );
        }
        
        System.out.println("Arreglo de la clase perro");
        
        Perro[] lista = new Perro[3]; 
        lista[0]= new Perro("Poddle", 1);
        lista[1]= new Perro("San Bernardo", 2);
        lista[2]= new Perro("Akita", 3);
        // fore+ TAB
        for (Perro perro : lista) {
            perro.comer();
        }
        
        System.out.println("Todos los perros a doberman");
        for (Perro perro : lista) {
            perro.setRaza("Doberman");
        }
        for (Perro perro : lista) {
            System.out.println(perro);
        }
        System.out.println("----SIN GENERICAS----");
        // Arraylist de la clase perro 
        ArrayList mascotas = new ArrayList(); 
        mascotas.add(new Perro("Poddle", 1));
        mascotas.add(new Perro("Doberman", 2));
        mascotas.add(new Perro("Akita", 2));
        mascotas.add(new Perro("Gran Danes", 3));
        mascotas.add(new Perro("Chihuahua", 0));
        
        for (Object mascota : mascotas) {
            Perro tmp = (Perro)mascota; 
            System.out.println(tmp);
        }
                
        //Despues de la version 2 de Java se agrego el concepto de clases
        //genericas
        System.out.println("----genericas-----");
        ArrayList<Perro> mascotas2 = new ArrayList<>(); 
        mascotas2.add(new Perro("Poddle", 1));
        mascotas2.add(new Perro("Doberman", 2));
        mascotas2.add(new Perro("Akita", 2));
        mascotas2.add(new Perro("Gran Danes", 3));
        mascotas2.add(new Perro("Chihuahua", 0));
        
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Que raza quieres cambiar de tam??");
        /*String raza = teclado.next(); 
        
        for (Perro perro : mascotas2) {
            if(perro.getRaza().equals( raza )){
                perro.setTamano(4);
            }
        }
        */
        for (Perro perro : mascotas2) {
            System.out.println( perro );   
        }
        System.out.println("----------");
        mascotas2.add(2, new Perro("Pug", 2));
        for (Perro perro : mascotas2) {
            System.out.println(perro);
        }
        System.out.println("Perro 2 es:"+ mascotas2.get(2));
        System.out.println("--.-.-.-..-.-.-.-.-.-.");
        System.out.println("Elimiar el akita, index 3");
        Perro p=mascotas2.remove(3);
        
        for (Perro perro : mascotas2) {
            System.out.println(perro);
        }
        System.out.println(".-.-.-.");
        System.out.println("El perro sacado es:" + p);
        System.out.println(".-.-.-.-.");
        mascotas2.set(1, new Perro("Boxer", 3)); 
        mascotas2.set(2, new Perro("Labrador", 4));
        for (Perro perro : mascotas2) {
            System.out.println(perro);
        }
        
        //Manejo de excepciones 
        System.out.println("Elige un numero entre 0 y 4: ");
        
        Perro puppy=null;
        try{
            int indice=teclado.nextInt();
            puppy = mascotas2.get(indice); 
        }catch(IndexOutOfBoundsException ex){
            System.out.println("Ocurrió un error, el valor debe de estar entre 0 y 4");
            System.out.println(ex.getMessage());
            puppy=mascotas2.get(0);
        }catch(InputMismatchException ime){
            System.out.println("Solo deben de ser numeros");
            puppy=mascotas2.get(0);
        }catch(Exception e){
            System.out.println("último recurso....");
        }finally{
            System.out.println("En finally");
            System.out.println(puppy);
        }
        //ERROR != EXCEPCION
        System.out.println("Se alcanzó el fin del programa ");
    }
        
        
        
    }
        
    

