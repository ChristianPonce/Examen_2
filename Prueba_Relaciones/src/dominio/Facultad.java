
package dominio;

import java.util.ArrayList;

public class Facultad {
    private String Ciencias_Ba;
    private String Ciencias_Ex;
    private String Profesor;
    private String Carrera;
    private ArrayList<Profesor> profesor = new ArrayList<>();
    private ArrayList<Carrera> carrera = new ArrayList<>();
    
    public Facultad(String Ciencias_Ba,String Ciencias_Ex, String Profesor, String Carrera){
        this.Ciencias_Ba= Ciencias_Ba;
        this.Ciencias_Ex= Ciencias_Ex;
        this.Profesor= Profesor;
        this.Carrera= Carrera;
    }

    public String getProfesor() {
        return Profesor;
    }

    public void agregaProfesor(Profesor profe){
        profesor.add(profe);
        profe.setMate(Profesor);
    }
    
    public String getCarrera() {
        return Carrera;
    }

    public void agregaCarrera(Carrera car){
        carrera.add(car);
        car.setElect(Carrera);
    }

    public String getCiencias_Ba() {
        return Ciencias_Ba;
    }

    public void setCiencias_Ba(String Ciencias_Ba) {
        this.Ciencias_Ba = Ciencias_Ba;
    }

    public String getCiencias_Ex() {
        return Ciencias_Ex;
    }

    public void setCiencias_Ex(String Ciencias_Ex) {
        this.Ciencias_Ex = Ciencias_Ex;
    }
    
}
