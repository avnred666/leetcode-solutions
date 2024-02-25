import java.util.HashMap;

/**
 * https://leetcode.com/problems/valid-anagram
 */
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap <Character,Integer> countMap = new HashMap<>();
        for(int i=0; i<s.length();i++){
            char sChar = s.charAt(i);
            countMap.put(sChar, countMap.getOrDefault(sChar,0)+1);
        }
        for(int i=0; i<t.length();i++){
            char tChar = t.charAt(i);
            if(!countMap.containsKey(tChar) || countMap.get(tChar) == 0) return false;
            countMap.put(tChar,countMap.get(tChar)-1);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("abcd","dcbb"));
    }
}
