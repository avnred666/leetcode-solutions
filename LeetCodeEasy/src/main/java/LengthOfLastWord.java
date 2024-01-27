/**
 * https://leetcode.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s){
        s=s.trim();
        int l = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == ' '){
                break;
            }
            l++;
        }
        return l;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World O"));
    }
}
