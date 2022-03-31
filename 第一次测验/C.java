import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        String a= scanner.nextLine();
        String b = scanner.nextLine();
        if (a.length()!=b.length()) {
            System.out.println(1);
            return ;
        }
         else if(a.equals(b)) {
            System.out.println(2);
            return ;
        }
        else if(a.equalsIgnoreCase(b)) {
            System.out.println(3);
            return ;
        }
        System.out.println(4); 
}
}