/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flooring;
import java.util.Scanner;
public class Flooring {

   
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        double lengthRoom, widthRoom, heightRoom, lengthDoor, widthDoor, lengthWindow1, lengthWindow2, widthWindow1, widthWindow2, lengthBook, widthBook, costPaint, costCarpet;
        
        
        System.out.println("dimensions of room in feet");
        System.out.println("length:");
        lengthRoom=keyboard.nextDouble();
        System.out.println("width:");
        widthRoom=keyboard.nextDouble();
        System.out.println("height");
        heightRoom=keyboard.nextDouble();
        System.out.println();
        System.out.println("The dimensions of this room are "+lengthRoom+ "x"+widthRoom+"x"+heightRoom);
        System.out.println();
        System.out.println("The lenth and width of the door is:");
        System.out.println("length:");
        lengthDoor=keyboard.nextDouble();
        System.out.println("width");
        widthDoor=keyboard.nextDouble();
        System.out.println("The length and width of window 1 is:");
        System.out.println("length:");
        lengthWindow1=keyboard.nextDouble();
        System.out.println("width");
        widthWindow1=keyboard.nextDouble();
        System.out.println("The length and width of window 2 is:");
        System.out.println("length:");
        lengthWindow2=keyboard.nextDouble();
        System.out.println("width");
        widthWindow2=keyboard.nextDouble();
        System.out.println("The length and width of the bookshelf:");
        System.out.println("length:");
        lengthBook=keyboard.nextDouble();
        System.out.println("width");
        widthBook=keyboard.nextDouble(); 
        System.out.println("Door:"+lengthDoor+"x"+widthDoor);
        System.out.println("Window 1:"+lengthWindow1+"x"+widthWindow1);
        System.out.println("Window 2:"+lengthWindow2+"x"+widthWindow2);
        System.out.println("Bookshelf:"+lengthBook+"x"+widthBook);
        System.out.println("cost per square foot paint:");
        costPaint=keyboard.nextDouble();
        System.out.println("cost per square foot of carpet:");
        costCarpet=keyboard.nextDouble();
        
        System.out.println("The cost per square foot of paint is $"+costPaint);
        System.out.println("The cost per square foot of carpet is $"+costCarpet);
        
        //calculate
        costCarpet=costCarpet*lengthRoom*widthRoom;
        costPaint=costPaint*(((2*widthRoom*heightRoom)+(2*lengthRoom*heightRoom))-(lengthDoor*widthDoor)-(lengthWindow1*widthWindow1)-(lengthWindow2*widthWindow2)-(lengthBook*widthBook));
        // System output
        System.out.println("The cost to cover the carpet is $"+costCarpet);
        System.out.println("The cost to cover the paint is $"+costPaint);
    }
    
}
