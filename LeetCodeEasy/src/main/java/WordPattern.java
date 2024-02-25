/**
 * https://leetcode.com/problems/word-pattern
 */

import java.util.HashMap;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s){
        String[] words = s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        HashMap<Character,String> map = new HashMap<>();

        for(int i=0; i< words.length; i++){
            char p_char = pattern.charAt(i);
            if(map.containsKey(p_char)){
                if(!map.get(p_char).equals(words[i])) return false;
            }
            else{
                if(map.containsValue(words[i])){
                    return false;
                }
                map.put(p_char,words[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abca","dog car man dog"));
    }
}
