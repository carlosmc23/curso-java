package dia2;

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
public abstract class Person{
    protected String name;
    protected String lastname;
    protected String dateOfBirthday;
    protected String dni;
 
    public Person(String name, String lastname, String dateOfBirthday, String dni){
        this.name= name;
        this.lastname=lastname;
        this.dateOfBirthday= dateOfBirthday;
        this.dni=dni;      
    }
    public String getName() {
        return this.name;
    }
    public void serName(String name){
        this.name=name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", lastname=" + lastname + ", dateOfBirthday=" + dateOfBirthday + ", dni=" + dni + '}';
    }
    public abstract String gretting();
}
