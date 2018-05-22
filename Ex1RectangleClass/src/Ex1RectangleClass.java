/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author 17011947
 */
public class Ex1RectangleClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        
        Rectangle[] rooms = new Rectangle[5];
        for(int i = 0; i<rooms.length; i++) {
            System.out.print("Enter the length of the room: " + i + ">");
            int length = scan.nextInt();
            System.out.print("Enter the width of the room: " + i + ">");
            int width = scan.nextInt();
            rooms[i] = new Rectangle(length, width);
        }
        
        
        int totalArea = 0;
        for (int i = 0; i<rooms.length; i++) {
            double roomArea = rooms[i].getArea();
            System.out.println("Area of room: " + i + "is" + roomArea);
            totalArea = totalArea + roomArea;
        }
       
        System.out.println("Total area is: " + totalArea);

        
    }
    
}
