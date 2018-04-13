/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia4;

import dia2.Person;

/**
 *
 * @author carlos
 */
public class University {

    private String name;
    private Person[] persons;//asi se declara un arreglo estatico siempre tiene un tamanio
    private static int limit = 5;//aca declaramos su tamanio
    private int count;
    //{[],[],[],[],[]} un arregl nos sirver para contener personas
    public University(String name) {
        this.name = name;
        this.count = 0;
        this.persons = new Person[limit];
    }
    public void addPerson( Person newPerson){
        if(count < persons.length){
        this.persons[count] = newPerson;
        count = count + 1;
        }
    }
      
    public void showListPerson(){
        System.out.println("show list person");
        //
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
    }

}
