/**
 * https://leetcode.com/problems/longest-common-prefix
 */
public class LongestCommonPrefix {
    public static String longestPrefix (String[] strs){
        String prefix = strs[0];
        for (String str : strs) {
            while (str.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        System.out.println(longestPrefix(new String[]{"abc","abd","add"}));
    }
}
