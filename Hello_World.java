import java.util.Scanner;

/*Hello World Program using Java*/
public class Hello_World {
    public static void main(String[] args) {
        System.out.println("PLEASE ENTER Two NUMBER");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.printf("%d is moto number",a);
        }
        else
        {
            System.out.printf("%d is moto number",b);
        }

    }
}
