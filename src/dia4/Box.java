/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia4;// clases genericas  son la clave

import dia3.Bicycle;

/**
 *
 * @author carlos
 */
public class Box<T, Y> {
    
    private T fistSubBox;
    private Y secondSubBox;

    public Box(T fistSubBox, Y secondSubBox) {
        this.fistSubBox = fistSubBox;
        this.secondSubBox = secondSubBox;
    }

    

    public T getFistSubBox() {
        return fistSubBox;
    }

    @Override
    public String toString() {
        return "Box{" + "fistSubBox=" + fistSubBox + ", secondSubBox=" + secondSubBox + '}';
    }

    

    
    
}
