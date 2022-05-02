import java.util.Scanner;

/*conditional and branching statement
3. Write a program to find maximum NO from given 3 no.
*/
public class Ternary_max3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float max=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println("MAXIMUM NUMBER IS "+max);
    }
}
