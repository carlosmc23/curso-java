/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia4;

import dia2.Student;
import dia2.Teacher;

/**
 *
 * @author carlos
 */
public class Main {
    public static void main(String[] args) {
        University university1;
        university1 = new University("UMSS");
        
        Teacher teacher1 = new Teacher("doctor", "carlos", "menseses", "24, may, 1990", "345435345");
        Student student2 = new Student("234234234", "jorge", "beeltran", "45, dec, 20000", "345345345");
        Student student3 = new Student("gdfgdf", "juan", "cossio", "45, dec, 2012", "23452345");
        
        
        university1.addPerson(teacher1);
        university1.addPerson(student2);
        university1.addPerson(student3);
        
        university1.showListPerson();
        
        //termina ejemplo de arreglos estaticos
        
        System.out.println("Generic class: ");
        
        Box<Teacher, Student> box1 = new Box<>(teacher1, student3);
        
        System.out.println(box1);
        
    }
}
