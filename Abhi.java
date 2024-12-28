
import java.util.Scanner;
public class Abhi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sales[]=new int[7];
        for(int i=0;i<7;i++){
            sales[i]=scan.nextInt();
        }
        for(int i=0;i<7;i++)
        {
                  switch (i+1) {
                      case 1:
                          System.out.println("Monday :"+sales[i]);
                          break;
                      case 2:
                          System.out.println("Monday :"+sales[i]);
                          break;
                      case 3:
                          System.out.println("Monday :"+sales[i]);
                          break;
                      case 4:
                          System.out.println("Monday :"+sales[i]);
                          break;
                      case 5:
                          System.out.println("Monday :"+sales[i]);
                          break;
                      case 6:
                          System.out.println("Monday :"+sales[i]);
                          break;
                      case 7:
                          System.out.println("Monday :"+sales[i]);
                          break;
        }
    }
    
    }
}
