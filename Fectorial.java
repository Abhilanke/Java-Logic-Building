import java.io.PrintStream;
import java.util.Scanner;
public class Fectorial { //5!=5*4*3*2*1=120;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your number :");
        int num=scan.nextInt();
        int a=1;
        for(int i=1;i<=num;i++){
             a = a * i;
        }
        System.out.println(a);

    }
}
