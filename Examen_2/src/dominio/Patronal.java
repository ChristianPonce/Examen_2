
package dominio;

public class Patronal extends Jubilados {
    private int tipoEmpresa;
    public Patronal(String nombre, String cedula, double salarioBase, int aniosAportacion, int tipoEmpresa){
        super(nombre,cedula,salarioBase,aniosAportacion);
        this.tipoEmpresa = tipoEmpresa;
    }
    public void mostrarDatosPat(){
        double PI, menor, P1, menor1, P2, menor2, P3, menor3, P4, menor4, P5, menor5;
        if(tipoEmpresa==1){
            if(getAniosAportacion()<=10){
            menor=getSalarioBase()/2;
            PI=menor+(menor*0.05);
            System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                +"\nSalario Base: "+menor+"\nAnios de Aportacion: "
                +getAniosAportacion()+"\nEmpresa: Publica"+"\nSalario Total A Recibir por Patronal: "+PI);
            }
            else if(getAniosAportacion()>10&&getAniosAportacion()<=20){
                menor1 = getSalarioBase() * 0.6;
                P1 = menor1 + (menor1 * 0.05);
                System.out.println("Nombre: " + getNombre() + "\nC.I: " + getCedula()
                        + "\nSalario Base: " + menor1 + "\nAnios de Aportacion: "
                        + getAniosAportacion() + "\nEmpresa: Publica" + "\nSalario Total A Recibir por Patronal: " + P1);
            } else if (getAniosAportacion() > 20 && getAniosAportacion() <= 30) {
                menor2 = getSalarioBase() * 0.7;
                P2 = menor2 + (menor2 * 0.05);
                System.out.println("Nombre: " + getNombre() + "\nC.I: " + getCedula()
                        + "\nSalario Base: " + menor2 + "\nAnios de Aportacion: "
                        + getAniosAportacion() + "\nEmpresa: Publica" + "\nSalario Total A Recibir por Patronal: " + P2);
            } else if (getAniosAportacion() > 30 && getAniosAportacion() <= 35) {
                menor3 = getSalarioBase() * 0.8;
                P3 = menor3 + (menor3 * 0.05);
                System.out.println("Nombre: " + getNombre() + "\nC.I: " + getCedula()
                        + "\nSalario Base: " + menor3 + "\nAnios de Aportacion: "
                        + getAniosAportacion() + "\nEmpresa: Publica" + "\nSalario Total A Recibir por Patronal: " + P3);
            } else if (getAniosAportacion() > 36 && getAniosAportacion() <= 39) {
                menor4 = getSalarioBase() * 0.9;
                P4 = menor4 + (menor4 * 0.05);
                System.out.println("Nombre: " + getNombre() + "\nC.I: " + getCedula()
                        + "\nSalario Base: " + menor4 + "\nAnios de Aportacion: "
                        + getAniosAportacion() + "\nEmpresa: Publica" + "\nSalario Total A Recibir por Patronal: " + P4);
            } else if (getAniosAportacion() >= 40) {
                menor5 = getSalarioBase();
                P5 = menor5 + (menor5 * 0.05);
                System.out.println("Nombre: " + getNombre() + "\nC.I: " + getCedula()
                        + "\nSalario Base: " + menor5 + "\nAnios de Aportacion: "
                        + getAniosAportacion() + "\nEmpresa: Publica" + "\nSalario Total A Recibir por Patronal: " + P5);
            }
        }
        
        if (tipoEmpresa == 0) {
            if (getAniosAportacion() <= 10) {
                menor = getSalarioBase() / 2;
                PI = menor + (menor * 0.1);
                System.out.println("Nombre: " + getNombre() + "\nC.I: " + getCedula()
                        + "\nSalario Base: " + menor + "\nAnios de Aportacion: "
                        + getAniosAportacion() + "\nEmpresa: Privada" + "\nSalario Total A Recibir por Patronal: " + PI);
            } else if (getAniosAportacion() > 10 && getAniosAportacion() <= 20) {
                menor1 = getSalarioBase() * 0.6;
                P1 = menor1 + (menor1 * 0.1);
                System.out.println("Nombre: " + getNombre() + "\nC.I: " + getCedula()
                        + "\nSalario Base: " + menor1 + "\nAnios de Aportacion: "
                        + getAniosAportacion() + "\nEmpresa: Privada" + "\nSalario Total A Recibir por Patronal: " + P1);
            } else if (getAniosAportacion() > 20 && getAniosAportacion() <= 30) {
                menor2 = getSalarioBase() * 0.7;
                P2 = menor2 + (menor2 * 0.1);
                System.out.println("Nombre: " + getNombre() + "\nC.I: " + getCedula()
                        + "\nSalario Base: " + menor2 + "\nAnios de Aportacion: "
                        + getAniosAportacion() + "\nEmpresa: Privada" + "\nSalario Total A Recibir por Patronal: " + P2);
            } else if (getAniosAportacion() > 30 && getAniosAportacion() <= 35) {
                menor3 = getSalarioBase() * 0.8;
                P3 = menor3 + (menor3 * 0.1);
                System.out.println("Nombre: " + getNombre() + "\nC.I: " + getCedula()
                        + "\nSalario Base: " + menor3 + "\nAnios de Aportacion: "
                        + getAniosAportacion() + "\nEmpresa: Privada" +  "\nSalario Total A Recibir por Patronal: " + P3);
            } else if (getAniosAportacion() > 36 && getAniosAportacion() <= 39) {
                menor4 = getSalarioBase() * 0.9;
                P4 = menor4 + (menor4 * 0.1);
                System.out.println("Nombre: " + getNombre() + "\nC.I: " + getCedula()
                        + "\nSalario Base: " + menor4 + "\nAnios de Aportacion: "
                        + getAniosAportacion() + "\nEmpresa: Privada " + "\nSalario Total A Recibir por Patronal: " + P4);
            } else if (getAniosAportacion() >= 40) {
                menor5 = getSalarioBase();
                P5 = menor5 + (menor5 * 0.1);
                System.out.println("Nombre: " + getNombre() + "\nC.I: " + getCedula()
                        + "\nSalario Base: " + menor5 + "\nAnios de Aportacion: "
                        + getAniosAportacion() + "\nEmpresa: Privada " + "\nSalario Total A Recibir por Patronal: " + P5);
            }
        }
    }
}
