/**
 * https://leetcode.com/problems/roman-to-integer
 */

import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('M',1000);
        map.put('D',500);
        map.put('C',100);
        map.put('L',50);
        map.put('X',10);
        map.put('V',5);
        map.put('I',1);

        int n = s.length();
        int total = 0;

        for(int i=0; i<n-1; i++){
            int val = map.get(s.charAt(i));
            int nextVal = map.get(s.charAt(i+1));
            if(val<nextVal){
                total -= val;
            }
            else{
                total += val;
            }
        }
        total += map.get(s.charAt(n-1));
        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("XV"));
    }
}
