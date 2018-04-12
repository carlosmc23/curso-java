/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia3;

/**
 *
 * @author carlos
 */
public class Main {
    public static void main(String args[]) {
        
        Bicycle bicycle1;
        Bicycle bicycle2;
        
        bicycle1 = new Bicycle(2500, "trueno");
        bicycle2 = new Bicycle(2500, "trueno", 5);
        
        System.out.println(bicycle1.getPrice());
        System.out.println(bicycle1.getBrand());
        System.out.println(bicycle1.getStates());
        System.out.println(bicycle2.getStates());
        
    }
}
