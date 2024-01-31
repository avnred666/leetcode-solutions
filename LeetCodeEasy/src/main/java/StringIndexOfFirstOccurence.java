/**
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 */
public class StringIndexOfFirstOccurence {
    public static int strStr(String haystack, String needle){
        int m = haystack.length();
        int n = needle.length();
        for(int i=0; i<=m-n; i++){
            if(haystack.substring(i,i+n).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("haystack","stack"));
    }
}
