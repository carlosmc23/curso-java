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
public class Circle extends Shape{
    
    private double radius;

    public Circle(double radius, String name) {
        super(name);
        this.radius = radius;
    }
    
    
    @Override
    public String gretting(){
        return "hello iam a rectangle";
    }

    @Override
    public double calculateArea() {
        return 8.0;
    }

    @Override
    public double calculatePerimeter() {
        return 9.0;
    }
    
    
}
