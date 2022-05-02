/*Write a program to create basic calculator by getting 2 numbers
and 1 string (operation) from the user and apply the operation
given in a string on the given numbers. */


import java.util.Scanner;
import java.lang.String;

public class Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter operation");
        int op = sc.nextInt();
        switch (op) {
            case '+':
                int c = a + b;
                System.out.println(c);
                break;
            case '-':
                int d = a - b;
                System.out.println(d);
                break;
            case '*':
                int e = a * b;
                System.out.println(e);
                break;
            case '/':
                int  h= a / b;
                System.out.println(h);
                break;
            default:
                System.out.println("please enter valid input");
                break;
        }
    }
}




