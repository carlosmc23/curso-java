package dia1;

//import .*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos
 */
public class Main {

    public static void main(String args[]) {
        //System.out.println("hola mundo");
        //declaracion
        Persona personaJuan;
        //instaciacion o constuccion
        //personaJuan = new Persona();
        personaJuan = new Persona("Juan", "Perez");
        //personaJuan.nombre="Juan";
        //personaJuan.apellido="Perez";

        System.out.println("Mostrando el nombre y apellido");
        //System.out.println(personaJuan.apellido);
        //System.out.println(personaJuan.nombre);

        //metodo dinamico
        System.out.println("Nombre Completo");
        System.out.println(personaJuan.getNOmbreCompleto());
        System.out.println("Accediendo al nombre con el metodo get");
        System.out.println(personaJuan.getNombre());
        //probando el metodo set
        System.out.println("cambiando el nombre a Pedro");
        personaJuan.setNombre("Pedro");
        System.out.println(personaJuan.getNOmbreCompleto());

        System.out.println("accediendo al apellido con el metodo get");
        System.out.println(personaJuan.getApellido());
        //probando el set de apellido
        System.out.println("cambiando el apellido a beltran");
        personaJuan.serApellido("Beltran");
        System.out.println(personaJuan.getNOmbreCompleto());

        //metodo toString
        System.out.println("Probando el metodo toString");
        System.out.println(personaJuan.toString());
    }

}
