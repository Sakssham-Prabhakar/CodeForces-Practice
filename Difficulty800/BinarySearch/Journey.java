// 2051B
import java.util.Scanner;
public class Journey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long sum = 0;
            long result = 0;
        
            int[] arr = new int[3];
            for(int i = 0; i < 3; i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            long fullCycle = n/sum;
            long days = fullCycle * 3;
            long rem = n % sum;
            if(rem > 0){
                if(rem <= arr[0]){
                    days += 1;
                }
                else if(rem <= arr[0] + arr[1]){
                    days += 2;
                }
                else{
                    days += 3;
                }
            }
            System.out.println(days);
        }
    }
}
