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
//atributos para la clase persona
//modificadores de acceso siver para restringir informacion
//public, private,protected
public class Persona {

    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //modificador, tipo de retorno nombre del metodo, parametros de entrada
    public String getNOmbreCompleto() {
        return nombre + " " + apellido;
    }

    //metodo publico get para pedir o acceder
    //metodo publico set para cambiar o modifocar
    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void serApellido(String apellido) {
        this.apellido = apellido;
    }
    @Override
    public String toString(){
    return "Nombre: "+ this.nombre + ", Apellido: " + this.apellido;
    }
}
