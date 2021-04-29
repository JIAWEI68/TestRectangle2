package com.example.testrecatangle2;

public class TestRectangle {
    public static double calculateArea(double length, double breadth) {
        System.out.print("Calculating area of rectangle with ");
        System.out.println("length = " + length + " cm and breadth = " + breadth + " cm");
        boolean Square = false;
        if (length==breadth)
        {Square=true;
            System.out.println("Rectangle is a square. " + Square );}
        else if (length!=breadth){
            Square=false;
            System.out.println("Rectangle is a square. " + Square);
        }
        double area = length * breadth;
        return area;
    }

    public static void main(String[] args) {
        double areaOfRectangle = calculateArea(10, 10);
        System.out.println(" Area of rectangle = " + areaOfRectangle + " cm sq");

    }
}
