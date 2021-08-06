
package dominio;

public class Vejez extends Jubilados {
    private int edad;
    public Vejez(String nombre, String cedula, double salarioBase, int aniosAportacion, int edad){
        super(nombre,cedula,salarioBase,aniosAportacion);
        this.edad = edad;
    }
    public void mostrarDatos(){
        double PI, menor, P1, menor1, P2, menor2, P3, menor3, P4, menor4, P5, menor5;
        if(getAniosAportacion()<=10){
            menor=getSalarioBase()/2;
            PI=menor+(menor*0.15);
            System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                +"\nSalario Base: "+menor+"\nAnios de Aportacion: "
                +getAniosAportacion()+"\nEdad: "+edad+"\nSalario Total A Recibir por Vejez: "+PI);
        }
        else if(getAniosAportacion()>10&&getAniosAportacion()<=20){
            menor1=getSalarioBase()*0.6;
            P1=menor1+(menor1*0.15);
            System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                +"\nSalario Base: "+menor1+"\nAnios de Aportacion: "
                +getAniosAportacion()+"\nEdad: "+edad+"\nSalario Total A Recibir por Vejez: "+P1);
        }
        else if(getAniosAportacion()>20&&getAniosAportacion()<=30){
            menor2=getSalarioBase()*0.7;
            P2=menor2+(menor2*0.15);
            System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                +"\nSalario Base: "+menor2+"\nAnios de Aportacion: "
                +getAniosAportacion()+"\nEdad: "+edad+"\nSalario Total A Recibir por Vejez: "+P2);
        }
        else if(getAniosAportacion()>30&&getAniosAportacion()<=35){
            menor3=getSalarioBase()*0.8;
            P3=menor3+(menor3*0.15);
            System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                +"\nSalario Base: "+menor3+"\nAnios de Aportacion: "
                +getAniosAportacion()+"\nEdad: "+edad+"\nSalario Total A Recibir por Vejez: "+P3);
        }
        else if(getAniosAportacion()>36&&getAniosAportacion()<=39){
            menor4=getSalarioBase()*0.9;
            P4=menor4+(menor4*0.15);
            System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                +"\nSalario Base: "+menor4+"\nAnios de Aportacion: "
                +getAniosAportacion()+"\nEdad: "+edad+"\nSalario Total A Recibir por Vejez: "+P4);
        }
        else if(getAniosAportacion()>=40){
            menor5=getSalarioBase();
            P5=menor5+(menor5*0.15);
            System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                +"\nSalario Base: "+menor5+"\nAnios de Aportacion: "
                +getAniosAportacion()+"\nEdad: "+edad+"\nSalario Total A Recibir por Vejez: "+P5);
        }
    }
}
