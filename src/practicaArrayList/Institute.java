/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaArrayList;

import dia2.Person;
import dia2.Student;
import dia2.Teacher;
import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class Institute {
    
    private String nombre;
    private ArrayList<Person> personsInst;

    public Institute(String nombre) {
        this.nombre = nombre;
        this.personsInst = new ArrayList<>();
    }
    
    public void addPersonInst(Person newPersonInst){
        this.personsInst.add(newPersonInst);
    }
    
    public void showPersonsInst(){
        for (int i = 0; i < personsInst.size(); i++) {
            System.out.println(personsInst.get(i));
        }
    }
    
    public void showStudentsInst(){
        for (Person persontoIterate : personsInst) {
            if(persontoIterate instanceof Student){
            System.out.println(persontoIterate.toString());
            }
        }
    }
     public void showTeachersInst(){
         for (Person person : personsInst) {
             if (person instanceof Teacher) {
                 System.out.println(person.toString());
             }
             
         }
     }
}
