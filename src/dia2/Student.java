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
public class Student extends Person {
    
    private String codsis;

    public Student(String codsis, String name, String lastname, String dateOfBirthday, String dni) {
        super(name, lastname, dateOfBirthday, dni);
        this.codsis = codsis;
    }

    public String getCodsis() {
        return codsis;
    }

    public void setCodsis(String codsis) {
        this.codsis = codsis;
    }
    @Override
    public String gretting(){
    return "hello my name is "+ this.name;
    }
      
    
}
