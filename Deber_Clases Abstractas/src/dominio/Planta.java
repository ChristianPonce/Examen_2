
package dominio;

public class Planta extends SerVivo{
    
    @Override
    public void alimentarse(){
        System.out.println("¿Como se alimentan las plantas?:");
        System.out.println("Las plantas se alimentan por medio del proceso"
                + " de la fotosíntesis.");
    }
}
