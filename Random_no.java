import java.util.Scanner;
public class Random_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mynumber=(int)(Math.random()*100);
        int usernumber=0;
        do{
            System.out.println("Guess My number(1-100):");
            usernumber=sc.nextInt();
            if(usernumber==mynumber){
                System.out.println("WOOHOO.......CORRECT NUMBER");
                break;
            }else if(usernumber>mynumber){
                System.out.println("YOUR NUMBER IS TO LARGE");
            }
            else {
                System.out.println("YOUR NUMBER IS TO SMALL");
            }
        }while (usernumber>=0);
        System.out.println("MY NUMBER WAS:"+mynumber);
    }
}
