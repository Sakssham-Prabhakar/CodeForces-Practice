//1996A
import java.util.Scanner;
public class Legs {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    
    while (t-- > 0) {
            int n = sc.nextInt();
            int cows = n / 4;
            int hens = (n % 4) / 2;
            System.out.println(cows + hens);
        }
    }
}
