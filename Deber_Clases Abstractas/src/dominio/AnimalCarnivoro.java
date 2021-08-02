
package dominio;

public class AnimalCarnivoro extends Animal{
    
    @Override
    public void alimentarse(){
        System.out.println("¿Como se alimentan los animales carnivoros?");
        System.out.println("El animal carnivoro se alimenta por medio de carne.");
    }
}
