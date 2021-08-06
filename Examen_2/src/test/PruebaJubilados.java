
package test;

import dominio.Discapacidad;
import dominio.Patronal;
import dominio.Vejez;
import java.util.Scanner;

public class PruebaJubilados {
    public static void main(String[] args) {
        //Aquí se cambia los años de aportacion para que el resultado sea de acuerdo 
        //a la tabla establecida
        Vejez vejez = new Vejez("1213","Jose",400, 21  ,67);
        vejez.mostrarDatos();
        System.out.println("\n");
        
        Vejez vejez1 = new Vejez("1013","Oswaldo",400, 35  ,70);
        vejez1.mostrarDatos(); 
        System.out.println("\n");
        //Aquí se debe variar en aportacion y discapacidad (de 10 en 10) para
        //de acuerdo a la tabla que me entregue los resultados
        
        Discapacidad discapacidad = new Discapacidad("1415","Luis",400,  15   ,   50   );
        discapacidad.mostrarDatosDis();
        System.out.println("\n");
        
        Discapacidad discapacidad1 = new Discapacidad("2115","Jorge",400,  29   ,   70   );
        discapacidad1.mostrarDatosDis();
        //Aqui se debe variar en aportacion y se debe decir si la empresa es Publica = 1, 
        //Privada = 0
        System.out.println("\n");
        
        Patronal patronal = new Patronal("1718","Juan",400,   40  , 1  );
        patronal.mostrarDatosPat();
        System.out.println("\n");
        
        Patronal patronal1 = new Patronal("2918","Marco",400,   14  , 0  );
        patronal1.mostrarDatosPat();
    }
    
}
