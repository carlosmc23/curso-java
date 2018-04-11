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
public class Main {

    public static void main(String arg[]) {
    /*
        Person person1 = new Person("Jorge", "Beltran", "May 26, 1992", "12341234");
        Person person2 = new Person("Jorge2", "Beltran2", "May 262, 21992", "212341234");
    
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        */
        System.out.println("Herencia");
        Teacher teacher1 = new Teacher("medico", "luis", "mercado", "Jan 24, 1990", "12312312321");
        Student student1 = new Student("201002345", "jorge", "beltran", "may 24, 1980", "7567443453");
        //System.out.println(teacher1.getLastname());

        //teacher1 es una instacia de la clase Teacher
        //Objeto es una instacia de una clase
        //un objeto solo vive en memoria
        //una clase abstracta no se puede istanciar
        //una clase abstracta tiene metodos sin definir
        //las clases que extiendan de una clase abstrac tienen que implementar los metodos abstractos de la clase abstracta
        //una clase abstracta declara la existencia de metodos pero no la implementacion
        //interfases
        //arraylist
        //
        
        System.out.println(student1.gretting());
        System.out.println(teacher1.gretting());
    }
}
