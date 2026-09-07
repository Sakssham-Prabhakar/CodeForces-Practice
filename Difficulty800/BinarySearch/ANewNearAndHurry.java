//750A
import java.util.Scanner;
public class ANewNearAndHurry{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int time = 240 - k;
        int low = 1;
        int high = n;
        int mid = 0;
        int ans = 0;
        while(low <= high){
            mid = low + (high-low)/2;
            int timeNeeded = 5* mid*(mid+1)/2;
            if(timeNeeded <= time){
                ans = mid;
                low = mid + 1;
            }
            else if(timeNeeded > time){
                high = mid - 1;
            }
        }
        System.out.print(ans);
    }
}