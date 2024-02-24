import java.util.HashMap;

/**
 * https://leetcode.com/problems/isomorphic-strings
 */
public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap <Character,Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char s_char = s.charAt(i);
            char t_char = t.charAt(i);
            if(map.containsKey(s_char)){
                if(map.get(s_char)!=t_char) {
                    return false;
                }
            }
            else{
                if(map.containsValue(t_char)){
                    return false;
                }
                map.put(s_char,t_char);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("abc","ddf"));
    }
}
