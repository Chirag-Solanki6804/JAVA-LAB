import java.util.Scanner;

/*5. Taking user input through Scanner class.*/
public class Pro5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name ");
        String name=sc.nextLine();
        System.out.println(name+" IS A NICE NAME");
    }
}
