 import java.util.Scanner;
 public class Main{
     public static void main(String[] args) {
        long j=1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n<=0||n>100||m<=0||m>100)    
            System.exit(0);
        for(int i=0;i<n;i++)
        {
            j*=m;
        }
        System.out.println("1/"+j);
     }
 }
     