
package test;

import dominio.AnimalCarnivoro;
import dominio.AnimalHerviboro;
import dominio.Planta;

public class PruebaSerVivo {
    
    public static void main(String[] args) {
        Planta planta1 = new Planta();
        planta1.alimentarse();
        
        AnimalHerviboro aHerviboro = new AnimalHerviboro();
        aHerviboro.alimentarse();
        
        AnimalCarnivoro aCarnivoro = new AnimalCarnivoro();
        aCarnivoro.alimentarse();
    }
}
