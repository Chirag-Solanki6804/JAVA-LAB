/*if-else ladders
        1. The marks obtained by a student in 5 different subjects are input through the keyboard.
        The student gets a division as per the following rules:
        a. Percentage above or equals to 60-first division
        b. Percentage between 50 to 59-second division
        c. Percentage between 40 and 49-Third division
        d. Percentage less than 40-fail
        Write a program to calculate the division obtained by the student.
*/

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of Maths");
        float a=sc.nextFloat();
        System.out.println("Enter marks of Physics");
        float b=sc.nextFloat();
        System.out.println("Enter marks of Chemistry");
        float c=sc.nextFloat();
        System.out.println("Enter marks of English");
        float d=sc.nextFloat();
        System.out.println("Enter marks of computer");
        float e=sc.nextFloat();
        float sum=a+b+c+d+e;
        float per=(100*sum)/500;
        System.out.println("YOUR PERCENTAGE IS "+per);
        if(per>=60)
        {
            System.out.println("fantastic!! you are in first division");
        }
        if(per>=50&&per<=59)
        {
            System.out.println("SUPERB!! YOU ARE IN second division");
        }
        if(per>=40&&per<=49)
        {
            System.out.println("NICE!! YOU ARE IN Third division");
        }
        if(per<=40)
        {
            System.out.println("fail");
            System.out.println("Try again");
        }

    }
}
