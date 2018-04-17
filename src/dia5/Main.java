/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia5;

import dia2.Person;
import dia2.Student;
import dia2.Teacher;

/**
 *
 * @author carlos
 */
public class Main {
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher("Doctor", "Juan", "Lozada", "24, jan, 2012", "634534445");
        Student student1 = new Student("45645634523", "jorge", "beltran", "12, jun, 19992", "4564564");
        
        School school1 = new School("Amerinst");
        
        Person person1 = new Person("jorge", "butron", "12, may, 1990", "345345") {
            @Override
            public String gretting() {
                return "clase abstracta";
            }
        };
        
        
        
        school1.addPerson(teacher1);
        school1.addPerson(student1);
        
        //school1.showPersons();
        
        //school1.showStudents();
        
        System.out.println(person1.toString());
        //para instaciar una clase abstracta se debe implentar todos sus metodos abstractos
    }
    
}
