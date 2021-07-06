
package dominio;

public class Empleados {
    
    private int dia;
    private int mes;
    private int anio;
    private String nombre;

    public Empleados(String nombre, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }
    public int getMes() {
        return mes;
    }
    public int getDia() {
        return dia;
    }
    public int getAnio() {
        return anio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
        @Override
    public String toString(){
       return this.nombre+" Fecha de Nacimiento (dd/mm/aa) : "+this.dia+"/"+this.mes+"/"+this.anio; 
    }
}