/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia3;
import dia2.Person;

/**
 *
 * @author carlos
 */
public class Bicycle {

    private int cadence = 0;
    private int speed = 0;
    private int gear = 1;
    private double price;
    private String brand;
    private Person owner;

    public Bicycle(double price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public Bicycle(double price, String brand, int gear) {
        this.price = price;
        this.brand = brand;
        this.gear = gear;
    }
    public Bicycle(double price, String brand, Person owner) {
        this.price = price;
        this.brand = brand;
        this.gear = gear;
        this.owner = owner;
    }
    

    public void changeGear(int gear) {
        this.gear = gear;
    }

    public void changeCadence(int cadence) {
        this.cadence = cadence;
    }

    public String getStates() {
        return "Cadence: " + this.cadence + "Speed: " + this.speed + "Gear: " + this.gear + "owner: "+ this.owner;
    }

    public double getPrice() {
        return this.price;
    }

    public String getBrand() {
        return this.brand;
    }

    public void incrementSpeed() {
        this.speed = this.speed + 1;
    }

    public void incrementSpeed(int increment) {
        this.speed = this.speed + increment;
    }

    public void aplybrakes(int decrement) {
        if (decrement <= this.speed) {
            this.speed = this.speed - decrement;
        } else {
            this.speed = 0;
        }
    }

    public void aplybrakes(){
        this.speed = this.speed - 1;
    }

}
