import java.util.*;
public class demo{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sales[]=new int[7];
        
        for(int i=0;i<7;i++)
        {
            sales[i]=scan.nextInt();
        }
        for(int i=0;i<7;i++)
        {
            switch(i+1)
            {
                case 1:
                    System.out.println("Monday :" +sales[i]);
                    break;
                case 2:
                    System.out.println("Tuesday :"+sales[i]);
                    break;
                case 3:
                    System.out.println("Wensaday :"+sales[i]);
                    break;
                case 4:
                    System.out.println("Thursday :"+sales[i]);
                    break;
                case 5:
                    System.out.println("Friday :"+sales[i]);
                    break;
                case 6:
                    System.out.println("Saturday :"+sales[i]);
                    break;
                case 7:
                    System.out.println("Sunday :"+sales[i]);
                    break;
            }
        }
    }

}
// inpute-:50 40 30 45 60 55 70
//Output
// Monday :50
// Tuesday :40
// Wensaday :30
// Thursday :45
// Friday :60
// Saturday :55
// Sunday :70
 