/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia5v2;

/**
 *
 * @author carlos
 */
public class Rectangle extends Shape {
    
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, String name) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }
    
    @Override
    public String gretting(){
        return "hello iam a rectangle";
    }

    @Override
    public double calculateArea() {
         return 7.0;
    }

    @Override
    public double calculatePerimeter() {
        return 8.0;
    }
    
    
}
