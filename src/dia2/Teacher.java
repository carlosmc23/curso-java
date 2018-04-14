/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia2;

/**
 *
 * @author carlos
 */
public class Teacher extends Person {

    private String profesion;

    public Teacher(String profesion, String name, String lastname, String dateOfBirthday, String dni) {
        super(name, lastname, dateOfBirthday, dni);
        this.profesion = profesion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String gretting() {
        return "hello, Iam a Teacher my profesion is "+this.profesion;
    }
    

   
    

}
