import java.util.HashMap;

/**
 * https://leetcode.com/problems/happy-number
 */
public class HappyNumber {
    public static boolean isHappy(int n){
        HashMap<Integer, Boolean> isSeen = new HashMap<>();
        while(n!=1 && !isSeen.containsKey(n)){
            isSeen.put(n,true);
            n = sumOfSquares(n);
        }
        return n==1;
    }

    public static int sumOfSquares(int n){
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum += digit*digit;
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(0));
    }
}
