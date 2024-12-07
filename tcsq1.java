import java.util.*;
class tcsq1{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sales[]=new int[7];
        
        for(int i=0;i<7;i++)
        {
            sales[i]=scan.nextInt();
        }
        for(int i=0;i<7;i++)
        {
            switch(i+1) {
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
// Input
// 22 33 44 55 66 77 55
// Output
// Monday :22
// Tuesday :33
// Wensaday :44
// Thursday :55
// Friday :66
// Saturday :77
// Sunday :55