package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	/* Write a program to print the area of two rectangles having sides (4,5) and (5,8)
	   respectively by creating a class named 'Rectangle'
	   with a method named 'Area' which returns the area and
	   length and breadth passed as parameters to its constructor.
	 */
    Rectangle r1 = new Rectangle(4,5);
    Rectangle r2 = new Rectangle(5,8);
    r1.Area();
    r2.Area();
    }
}
class Rectangle{
    int length;
    int breadth;
    float f;

    public Rectangle(int length_, int breadth_){
        this.length = length_;
        this.breadth = breadth_;
    }
    float Area(){
        f = length*breadth;
        System.out.println(f);
        return f;
    }
}


