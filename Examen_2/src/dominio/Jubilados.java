
package dominio;

import java.util.Scanner;

public class Jubilados {
    
    private String cedula;
    private String nombre;
    private double salarioBase = 400;
    private int aniosAportacion;
    
    public Jubilados(String cedula, String nombres, double salarioBase, int aniosAportacion) {
        this.cedula = cedula;
        this.nombre = nombres;
        this.salarioBase = salarioBase;
        this.aniosAportacion = aniosAportacion;
    }
    
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getAniosAportacion() {
        return aniosAportacion;
    }
    
    
}
