/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia3;

import dia2.Person;
import dia2.Teacher;


/**
 *
 * @author carlos
 */
public class Main {
    public static void main(String args[]) {
        
        Bicycle bicycle1;
        Bicycle bicycle2;
        Bicycle bicycle3;
        Bicycle bicycle4;
        
        Person owner4;
        
        owner4 = new Teacher("ingeniero", "angel", "antezana", "may, 24, 1990", "364553445234");
        
        bicycle1 = new Bicycle(2500, "trueno");
        bicycle2 = new Bicycle(3000, "trueno", 5);
        bicycle3 = new Bicycle(4000, "toshiba");
        bicycle4 = new Bicycle(6000, "toyota",owner4 );
        
        System.out.println(bicycle1.getPrice());
        System.out.println(bicycle1.getBrand());
        System.out.println(bicycle1.getStates());
        System.out.println(bicycle2.getStates());
        
        
        System.out.println("bicycle 3");
        System.out.println("change states");
        System.out.println(bicycle3.getStates());
        bicycle3.incrementSpeed();
        bicycle3.incrementSpeed();
        bicycle3.incrementSpeed();
        bicycle3.incrementSpeed(7);
        bicycle3.incrementSpeed(9);
        bicycle3.aplybrakes();
        bicycle3.aplybrakes(8);
        
        System.out.println(bicycle3.getStates());
        System.out.println(bicycle4.getStates());
        
        
        
        
    }
}
