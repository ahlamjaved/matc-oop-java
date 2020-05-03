/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javed_makingrectangles;

/**
 *
 * @author ahlamjaved
 */
public class Rectangle {
    
    private double length;
    private double width;
    
    public double getLength() {
        return length;
    }
    
    public void setLength(double len) {
        //this object variable length and not the parameter we just passewd in
        length = len;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double wid) {
        width = wid;
    }
    
    public double CalcArea() {
        return width * length;
    }
}
