import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/ransom-note
 */
public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine){
        Map<Character,Integer> letterCount = new HashMap<>();
        for(char c: magazine.toCharArray()){
            letterCount.put(c,letterCount.getOrDefault(c,0)+1);
        }
        for(char c:ransomNote.toCharArray()){
            if(!letterCount.containsKey(c) || letterCount.get(c)==0){
                return false;
            }
            letterCount.put(c,letterCount.get(c)-1);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("abcde","adecdbf"));
    }
}
