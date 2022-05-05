/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

/**
 *
 * @author emycr
 */
public class EstudianteDeportistaArtista extends Persona implements Deportista,Artista{
    private String carrera; 
    private String numeroCuenta; 
    private int semestre; 

    public EstudianteDeportistaArtista() {
    }

    public EstudianteDeportistaArtista(String carrera, String numeroCuenta, int semestre) {
        this.carrera = carrera;
        this.numeroCuenta = numeroCuenta;
        this.semestre = semestre;
    }

    public EstudianteDeportistaArtista(String carrera, String numeroCuenta, int semestre, String nombre, int edad) {
        super(nombre, edad);
        this.carrera = carrera;
        this.numeroCuenta = numeroCuenta;
        this.semestre = semestre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return super.toString()+ "EstudianteDeportistaArtista{" + "carrera=" + carrera + ", numeroCuenta=" + numeroCuenta + ", semestre=" + semestre + '}';
    }

   public void estudiar(){
            System.out.println("Estudiando.......");
    }

    @Override
    public void entrenar() {
         System.out.println(this.getNombre()+" está entrenando");
    }

    
    @Override
    public void jugar() {
        System.out.println(this.getNombre()+" está jugando fut");
    }

    @Override
    public void ensayar() {
        System.out.println(this.getNombre()+" está ensayando");
    }

    @Override
    public void presentar() {
        System.out.println(this.getNombre()+" está Presentando en el Vasconsuelos");
    }
    
    
}
