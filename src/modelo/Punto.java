/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.LinkedList;

/**
 *
 * @author JohanC
 */
public class Punto {
    public double X;
    public double Y;
    
     public Punto() {
    }

    public Punto(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    /**
     * Get the value of Y
     *
     * @return the value of Y
     */
    public double getY() {
        return Y;
    }

    /**
     * Set the value of Y
     *
     * @param Y new value of Y
     */
    public void setY(double Y) {
        this.Y = Y;
    }

    /**
     * Get the value of X
     *
     * @return the value of X
     */
    public double getX() {
        return X;
    }

    /**
     * Set the value of X
     *
     * @param X new value of X
     */
    public void setX(double X) {
        this.X = X;
    }

   

    @Override
    public String toString() {
        return "Punto: " + "( " + X + " , " + Y + " )" + '\n';
    }
    
    
}
