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
public class Triangle implements ComputableShape{
    
    private double b;
    private double h;

    public Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }
    @Override
    public double calculateArea(){
        return b*h;
    }
    @Override
    public double calculatePerimeter(){
        return 2*(b-h);
    }
    
    
}
