/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaArrayList;

import dia2.Student;
import dia2.Teacher;

/**
 *
 * @author carlos
 */
public class Main {
    public static void main(String[] args) {
        
        Teacher teacher1Inst = new Teacher("Doctor", "Jose", "Gomez", "jan, 30, 1990", "456456456456");
        Teacher teacher2Inst = new Teacher("Ingeniero", "Manuel", "Loza", "dec, 20, 1991", "5675674564");
        
        Student student1Inst = new Student("200504356", "pablo", "torrico", "may, 12, 1988", "3456345435");
        Student student2Inst = new Student("201005234", "jorge", "beltran", "jan, 02, 1991", "282828");
        Student student3Inst = new Student("201005234", "richi", "suarez", "oct, 10, 1998", "234234234");
        
        Institute institute1 = new Institute("American Institute");
        
        institute1.addPersonInst(teacher1Inst);
        institute1.addPersonInst(teacher2Inst);
        institute1.addPersonInst(student1Inst);
        institute1.addPersonInst(student2Inst);
        institute1.addPersonInst(student3Inst);
        
        System.out.println("Lista de personas en el instituto americano: ");
        institute1.showPersonsInst();
        System.out.println("Lista de estudiantes del instituto americano: ");
        institute1.showStudentsInst();
        System.out.println("Lista de profesores en el instituto americano: ");
        institute1.showTeachersInst();
    }
}
