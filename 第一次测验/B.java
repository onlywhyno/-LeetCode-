import java.util.Scanner;
public class cyy{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        if(n%2==0)
            System.out.println(""+n/2);
        else
            System.out.println(n/2+" "+(n/2+1));
    }
}/*这个方法不能AC，仅宫参考*/