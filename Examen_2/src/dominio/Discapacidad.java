
package dominio;

public class Discapacidad extends Jubilados{
    private int discapacidad;
    public Discapacidad(String nombre, String cedula, double salarioBase, int aniosAportacion, int discapacidad){
        super(nombre,cedula,salarioBase,aniosAportacion);
        this.discapacidad = discapacidad;
    }
    public void mostrarDatosDis(){
        double PD, sb, D1, sb1, D2, sb2, D3, sb3, D4, sb4, D5, sb5;
        if(getAniosAportacion()<=10){
            if(discapacidad <= 40){
                System.out.println("Porcentaje Discapacidad menor al 40%");
                System.out.println("En estos casos no presenta ningún bono adicional");
                sb=getSalarioBase()/2;
                PD=sb;
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Dicapacidad: "+PD);
            }
            else if(discapacidad == 40){
                System.out.println("Porcentaje Discapacidad del 40%");
                sb=getSalarioBase()/2;
                PD=sb+(sb*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+PD);
            }
            else if(discapacidad == 50){
                System.out.println("Porcentaje Discapacidad del 50%");
                sb=getSalarioBase()/2;
                PD=sb+(sb*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+PD);
            }
            else if(discapacidad == 60){
                System.out.println("Porcentaje Discapacidad del 60%");
                sb=getSalarioBase()/2;
                PD=sb+(sb*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+PD);
            }
            else if(discapacidad == 70){
                System.out.println("Porcentaje Discapacidad del 70%");
                sb=getSalarioBase()/2;
                PD=sb+(sb*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+PD);
            }
            else if(discapacidad == 80){
                System.out.println("Porcentaje Discapacidad del 80%");
                sb=getSalarioBase()/2;
                PD=sb+(sb*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+PD);
            }
            else if(discapacidad == 90){
                System.out.println("Porcentaje Discapacidad del 90%");
                sb=getSalarioBase()/2;
                PD=sb+(sb*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+PD);
            }
        }  
        
        else if(getAniosAportacion()>10 && getAniosAportacion()<=20){
            if(discapacidad <= 40){
                System.out.println("Porcentaje Discapacidad menor al 40%");
                System.out.println("En estos casos no presenta ningún bono adicional");
                sb1=getSalarioBase()/2;
                D1=sb1;
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb1+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Dicapacidad: "+D1);
            }
            else if(discapacidad == 40){
                System.out.println("Porcentaje Discapacidad del 40%");
                sb1=getSalarioBase()/2;
                D1=sb1+(sb1*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb1+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D1);
            }
            else if(discapacidad == 50){
                System.out.println("Porcentaje Discapacidad del 50%");
                sb1=getSalarioBase()/2;
                D1=sb1+(sb1*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb1+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D1);
            }
            else if(discapacidad == 60){
                System.out.println("Porcentaje Discapacidad del 60%");
                sb1=getSalarioBase()/2;
                D1=sb1+(sb1*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb1+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D1);
            }
            else if(discapacidad == 70){
                System.out.println("Porcentaje Discapacidad del 70%");
                sb1=getSalarioBase()/2;
                D1=sb1+(sb1*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb1+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D1);
            }
            else if(discapacidad == 80){
                System.out.println("Porcentaje Discapacidad del 80%");
                sb1=getSalarioBase()/2;
                D1=sb1+(sb1*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb1+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D1);
            }
            else if(discapacidad == 90){
                System.out.println("Porcentaje Discapacidad del 90%");
                sb1=getSalarioBase()/2;
                D1=sb1+(sb1*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb1+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D1);
            }
        }
        else if(getAniosAportacion()>20 && getAniosAportacion()<=30){
            if(discapacidad <= 40){
                System.out.println("Porcentaje Discapacidad menor al 40%");
                System.out.println("En estos casos no presenta ningún bono adicional");
                sb2=getSalarioBase()/2;
                D2=sb2;
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb2+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Dicapacidad: "+D2);
            }
            else if(discapacidad == 40){
                System.out.println("Porcentaje Discapacidad del 40%");
                sb2=getSalarioBase()/2;
                D2=sb2+(sb2*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb2+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D2);
            }
            else if(discapacidad == 50){
                System.out.println("Porcentaje Discapacidad del 50%");
                sb2=getSalarioBase()/2;
                D2=sb2+(sb2*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb2+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D2);
            }
            else if(discapacidad == 60){
                System.out.println("Porcentaje Discapacidad del 60%");
                sb2=getSalarioBase()/2;
                D2=sb2+(sb2*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb2+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D2);
            }
            else if(discapacidad == 70){
                System.out.println("Porcentaje Discapacidad del 70%");
                sb2=getSalarioBase()/2;
                D2=sb2+(sb2*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb2+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D2);
            }
            else if(discapacidad == 80){
                System.out.println("Porcentaje Discapacidad del 80%");
                sb2=getSalarioBase()/2;
                D2=sb2+(sb2*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb2+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D2);
            }
            else if(discapacidad == 90){
                System.out.println("Porcentaje Discapacidad del 90%");
                sb2=getSalarioBase()/2;
                D2=sb2+(sb2*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb2+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D2);
            }
        }
        else if(getAniosAportacion()>30 && getAniosAportacion()<=35){
            if(discapacidad <= 40){
                System.out.println("Porcentaje Discapacidad menor al 40%");
                System.out.println("En estos casos no presenta ningún bono adicional");
                sb3=getSalarioBase()/2;
                D3=sb3;
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb3+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Dicapacidad: "+D3);
            }
            else if(discapacidad == 40){
                System.out.println("Porcentaje Discapacidad del 40%");
                sb3=getSalarioBase()/2;
                D3=sb3+(sb3*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb3+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D3);
            }
            else if(discapacidad == 50){
                System.out.println("Porcentaje Discapacidad del 50%");
                sb3=getSalarioBase()/2;
                D3=sb3+(sb3*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb3+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D3);
            }
            else if(discapacidad == 60){
                System.out.println("Porcentaje Discapacidad del 60%");
                sb3=getSalarioBase()/2;
                D3=sb3+(sb3*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb3+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D3);
            }
            else if(discapacidad == 70){
                System.out.println("Porcentaje Discapacidad del 70%");
                sb3=getSalarioBase()/2;
                D3=sb3+(sb3*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb3+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D3);
            }
            else if(discapacidad == 80){
                System.out.println("Porcentaje Discapacidad del 80%");
                sb3=getSalarioBase()/2;
                D3=sb3+(sb3*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb3+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D3);
            }
            else if(discapacidad == 90){
                System.out.println("Porcentaje Discapacidad del 90%");
                sb3=getSalarioBase()/2;
                D3=sb3+(sb3*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb3+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D3);
            }
        }
        else if(getAniosAportacion()>36&&getAniosAportacion()<=39){
            if(discapacidad <= 40){
                System.out.println("Porcentaje Discapacidad menor al 40%");
                System.out.println("En estos casos no presenta ningún bono adicional");
                sb4=getSalarioBase()/2;
                D4=sb4;
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb4+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Dicapacidad: "+D4);
            }
            else if(discapacidad == 40){
                System.out.println("Porcentaje Discapacidad del 40%");
                sb4=getSalarioBase()/2;
                D4=sb4+(sb4*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb4+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D4);
            }
            else if(discapacidad == 50){
                System.out.println("Porcentaje Discapacidad del 50%");
                sb4=getSalarioBase()/2;
                D4=sb4+(sb4*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb4+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D4);
            }
            else if(discapacidad == 60){
                System.out.println("Porcentaje Discapacidad del 60%");
                sb4=getSalarioBase()/2;
                D4=sb4+(sb4*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb4+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D4);
            }
            else if(discapacidad == 70){
                System.out.println("Porcentaje Discapacidad del 70%");
                sb4=getSalarioBase()/2;
                D4=sb4+(sb4*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb4+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D4);
            }
            else if(discapacidad == 80){
                System.out.println("Porcentaje Discapacidad del 80%");
                sb4=getSalarioBase()/2;
                D4=sb4+(sb4*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb4+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D4);
            }
            else if(discapacidad == 90){
                System.out.println("Porcentaje Discapacidad del 90%");
                sb4=getSalarioBase()/2;
                D4=sb4+(sb4*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb4+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D4);
            }
        }
        else if(getAniosAportacion()>=40){
            if(discapacidad <= 40){
                System.out.println("Porcentaje Discapacidad menor al 40%");
                System.out.println("En estos casos no presenta ningún bono adicional");
                sb5=getSalarioBase()/2;
                D5=sb5;
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb5+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Dicapacidad: "+D5);
            }
            else if(discapacidad == 40){
                System.out.println("Porcentaje Discapacidad del 40%");
                sb5=getSalarioBase()/2;
                D5=sb5+(sb5*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb5+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D5);
            }
            else if(discapacidad == 50){
                System.out.println("Porcentaje Discapacidad del 50%");
                sb5=getSalarioBase()/2;
                D5=sb5+(sb5*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb5+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D5);
            }
            else if(discapacidad == 60){
                System.out.println("Porcentaje Discapacidad del 60%");
                sb5=getSalarioBase()/2;
                D5=sb5+(sb5*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb5+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D5);
            }
            else if(discapacidad == 70){
                System.out.println("Porcentaje Discapacidad del 70%");
                sb5=getSalarioBase()/2;
                D5=sb5+(sb5*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb5+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D5);
            }
            else if(discapacidad == 80){
                System.out.println("Porcentaje Discapacidad del 80%");
                sb5=getSalarioBase()/2;
                D5=sb5+(sb5*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb5+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D5);
            }
            else if(discapacidad == 90){
                System.out.println("Porcentaje Discapacidad del 90%");
                sb5=getSalarioBase()/2;
                D5=sb5+(sb5*(discapacidad/100));
                System.out.println("Nombre: "+getNombre()+"\nC.I: "+getCedula()
                    +"\nSalario Base: "+sb5+"\nAnios de Aportacion: "
                    +getAniosAportacion()+"\nDiscapacidad: "+discapacidad+"\nSalario Total A Recibir por Discapacidad: "+D5);
            }
        }
    }  
}
