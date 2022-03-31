import java.util.*;
        public class cyy {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                char a[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
                String str = scanner.next();
                for (int j = 0; j < str.length(); j++)
                {
                    System.out.print((a[((str.charAt(j) - 'a')+n)%26]));
                }
            }
        }