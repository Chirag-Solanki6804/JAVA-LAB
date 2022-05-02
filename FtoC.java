/*5. Write a program to convert temperature from Fahrenheit to Celsius.
 (Formula : c = f-32*5/9 ) .*/

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        float f=sc.nextFloat();
        float c=((f-32)*(5/9));
        System.out.println("temperature in Celsius "+c);
    }
}
