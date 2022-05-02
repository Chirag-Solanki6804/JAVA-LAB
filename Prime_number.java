/*conditional and branching statement
4. Write a program to check that the given number is prime or not.*/

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :");
        int a=sc.nextInt();
        for(int i=2;i<a/2;i++)
        {
            if(a%i==0)
            {
                System.out.println("NOT PRIME");
                break;
            }
            else
            {
                System.out.println("PRIME");
                break;
            }
        }

    }
}
