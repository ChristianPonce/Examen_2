
package test;

import dominio.Empleados;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PruebaEmpleados {

    static private FileWriter archivo;
    static private PrintWriter salida;
    static Scanner datos = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int n, edad = 0;
            archivo = new FileWriter("empleados.txt");
            salida = new PrintWriter(archivo);
            System.out.print("Lista de empleados \n");
            System.out.println("Indique el numero de empleados que desea registrar: ");
            salida.println("Indique el numero de empleados que desea registrar: ");
            n = datos.nextInt();
            salida.println(n);
            Empleados Empresa[] = new Empleados[n];
            llenaEmpresa(Empresa);
            System.out.println("Datos ingresados \n");
            salida.println("Datos ingresados \n");
            for (int i = 0; i<Empresa.length; i++) {
                edad = calculoEdad(Empresa[i].getDia(), Empresa[i].getMes(), Empresa[i].getAnio());
                System.out.println("Empleado No: " + (i + 1));
                salida.println("Empleado No: " + (i + 1));
                System.out.println("Nombre: " + Empresa[i].getNombre() + " \nFecha de nacimiento: " + Empresa[i].getDia() + "/" 
                        + Empresa[i].getMes() + "/" + Empresa[i].getAnio());
                salida.println("Nombre: " + Empresa[i].getNombre() + " \nFecha de nacimiento: " + Empresa[i].getDia() + "/" 
                        + Empresa[i].getMes() + "/" + Empresa[i].getAnio());
                System.out.println("Edad : " + edad+" años");
                salida.println("Edad : " + edad+" años");
                salida.flush();
            }
        } catch (IOException ex) {
            Logger.getLogger(PruebaEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void llenaEmpresa(Empleados Empresa[]) {
        String nombre;
        int dia, mes, anio;
        for (int i = 0; i < Empresa.length; i++) {
            datos.nextLine();
            System.out.println("Empleado No " +(i + 1));
            System.out.print("Nombre: ");
            nombre = datos.nextLine();
            System.out.println("Por favor ingrese su fecha de nacimiento (dd/mm/aa): ");
            System.out.println("Ingrese dia de nacimiento (1-31): ");
            dia = datos.nextInt();
            System.out.println("Ingrese mes de nacimiento (1-12): ");
            mes = datos.nextInt();
            System.out.println("Ingrese anio de nacimiento: ");
            anio = datos.nextInt();
            Empresa[i] = new Empleados(nombre, dia, mes, anio);
        }
    }
    public static int calculoEdad(int dia, int mes, int anio) {
        LocalDate fechaHoy = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        Period periodo = Period.between(fechaNacimiento, fechaHoy);
        return periodo.getYears();
    }
}
