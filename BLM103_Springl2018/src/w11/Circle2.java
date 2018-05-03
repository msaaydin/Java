/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w11;

/**
 *
 * @author Erebor
 */
public class Circle2 {

    /**
     * The radius of the circle
     */
    double radius;

    /**
     * The number of the objects created
     */
    static int numberOfObjects = 0;
    int Objectsnum = 0;

    /**
     * Construct a circle with radius 1
     */
    Circle2() {
        radius = 1.0;
        numberOfObjects++;
        Objectsnum++;
    }

    /**
     * Construct a circle with a specified radius
     */
    Circle2(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }
    
    static int getNumberOfObjects() {
        return numberOfObjects;
    }
     int getObjectsnum() {
        return this.Objectsnum;
    }
    /**
     * Return the area of this circle
     */
    double getArea() {
        return radius * radius * Math.PI;
    }
}
