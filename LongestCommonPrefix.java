public class LongestCommonPrefix {
    //Method finds the longest common prefix given an array of strings
    public String longestCommonPrefix(String[] strs) {
        //Check base cases of the input array
        if (strs == null || strs.length == 0) {
            return "";
        }

        //Brute force approach by checking every prefix of each string and comparing to the others
        //Note: This runs in O(n^2)
        for (int i = 0; i < strs[0].length(); i++) {
            char current = strs[0].charAt(i);

            for (String str : strs) {
                if (str.length() <= i || current != str.charAt(i)) {
                    return str.substring(0, i);
                }
            }
        }

        return strs[0];
    }
    public static void main(String[] args) {

    }
}