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
public class Main {

    public static void main(String[] args) {

        Circle circle1 = new Circle(20.2, "CIRCULO");
        Rectangle rectragle1 = new Rectangle(12.3, 5.6, "RECTANGULO");

        Triangle triangle = new Triangle(12.2, 4.6);
        Square square1 = new Square(4.3);

        System.out.println("Area de triangulo: " + triangle.calculateArea());
        System.out.println("Perimetro de triangulo: " + triangle.calculatePerimeter());

        System.out.println("Area del cuadrado: " + square1.calculateArea());
        System.out.println("Perimetro del cuadrado: " + square1.calculatePerimeter());

        System.out.println("-----------------------------------------");
        System.out.println("area del circulo: " + circle1.calculateArea());
        System.out.println("perimetro del circulo: " + circle1.calculatePerimeter());
        System.out.println("defaul metod del circulo: " + circle1.getSomething());
        System.out.println("defaul metod del circulo: " + circle1.gretting());
        
    }

}
