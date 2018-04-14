/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia5;

import dia2.Person;
import dia2.Student;
import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class School {

    private ArrayList<Person> persons;
    private String name;

    public School(String name) {
        this.name = name;
        this.persons= new ArrayList<>();
    }
    
    public void addPerson(Person newPerson){
        this.persons.add(newPerson);
    }
    public void showPersons(){
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }
    //hacer el delete persons----------------------------
    public void showStudents(){
        //tipo nombre : nombre del array list
        for (Person personsToIterate : persons) {
            if(personsToIterate instanceof Student){
                System.out.println(personsToIterate.toString());
            }
        
        }
    }
        
    
    
    
    
    
}
