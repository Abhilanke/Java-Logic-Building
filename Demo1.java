import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number");
        int no1= scanner.nextInt();
        System.out.print("Enetr Second Number");
        int no2= scanner.nextInt();
        System.out.print("Plaase Select Your Operation\n");
        System.out.println("1.Add");
        System.out.println("2.Sub");
        System.out.println("3.Mult");
        System.out.println("4.Div");
        System.out.print("Please choose Operation (1/4)");
        int choice=scanner.nextInt();
        switch (choice) {
            case 1:
            System.out.println("Addition is :"+(no1+no2));                
            break;
            case 2:
            System.out.println("Substraction is :"+(no1-no2));
            break;
            case 3:
            System.out.println("Multiplication is :"+(no1*no2));
            break;
            case 4:
            System.out.println("Divesion is :"+(no1/no2));
            break;

            default:
                throw new AssertionError();
        }


    }
    
}
// OutPut Is
// Enter First Number 3
// Enetr Second Number 4
// Plaase Select Your Operation
// 1.Add
// 2.Sub
// 3.Mult
// 4.Div
// Please choose Operation (1/4) 1
// Addition is :7
