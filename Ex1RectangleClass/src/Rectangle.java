/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 17011947
 */
public class Rectangle {

    int length;
    int width;

    public Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    
    public Rectangle() {
        length = 0;
        width = 0;
    }
    
    public void setLength(int newLength) {
        length = newLength;
    }
    
    public void setWidth(int newWidth) {
        width = newWidth;
    }
    
    public double getArea() {
        return length * width;
    }
    
    public double getPerimeter() {
        return length + width + length + width;
    }
}
