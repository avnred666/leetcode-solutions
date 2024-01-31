/**
 * https://leetcode.com/problems/reverse-words-in-a-string/
 */
public class ReverseWords {
    public static String reverseWords(String s) {
        String[] strings = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i= strings.length-1; i>=0; i-- ){
            sb.append(strings[i]);
            if(i>0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords(" Hello  World "));
    }
}
