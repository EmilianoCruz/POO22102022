/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componente;

import libro.componentes.Editorial;
import libro.componentes.Autor;

/**
 *
 * @author emycr
 */
public class Libro {
      private String titulo;
      private int paginas; 
      private Editorial empresa; 
      private Autor dueño;

    public Libro() {
    }

    public Libro(String titulo, int paginas, Editorial empresa, Autor dueño) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.empresa = empresa;
        this.dueño = dueño;
    }

    public Autor getDueño() {
        return dueño;
    }

    public void setDueño(Autor dueño) {
        this.dueño = dueño;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Editorial getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Editorial empresa) {
        this.empresa = empresa;
    }
@Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + "paginas=" + paginas + "editorial=" + empresa + "autor=" + dueño + '}';
    }
    
}





 

