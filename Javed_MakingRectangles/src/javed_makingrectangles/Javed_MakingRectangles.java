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
public class Javed_MakingRectangles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating two new objects of the class Rectangle
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        
        //System.out.println(rectangle1.getWidth());
        rectangle1.setWidth(3);
        //System.out.println(rectangle1.getLength());
        rectangle1.setLength(4);
        System.out.println("Rectangle 1 width:\t"+rectangle1.getWidth());
        System.out.println("Rectangle 1 length:\t"+rectangle1.getLength());
        System.out.println("Rectangle 1 Area:\t"+rectangle1.CalcArea());
        
        //System.out.println(rectangle2.getWidth());
        rectangle2.setWidth(9);
        //System.out.println(rectangle2.getLength());
        rectangle2.setLength(6);
        System.out.println("/n/n");
        System.out.println("Rectangle 1 width:\t"+rectangle2.getWidth());
        System.out.println("Rectangle 2 length:\t"+rectangle2.getLength());
        System.out.println("Rectangle 1 Area:\t"+rectangle2.CalcArea());
    }
    
}
