// 1703B
import java.util.Scanner;
public class ICPCBalloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] seen = new int[26];
            String str = sc.next();
            int output = 0;
            for(int i = 0; i < n;i++){
                seen[str.charAt(i) - 'A']++;
            }
            for(int i = 0; i < 26; i++){
                if(seen[i] > 0)
                    output += seen[i] + 1;
            }
            System.out.println(output);
        }
    }
}
