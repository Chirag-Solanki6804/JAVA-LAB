/*Write a program to calculate the area of circle.*/

import java.util.Scanner;

public class Area_of_circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle");
        float r=sc.nextFloat();
        double a=3.14*r*r;
        System.out.println(a);
    }
}
