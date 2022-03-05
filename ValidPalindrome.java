public class ValidPalindrome {

    //Checks if input string is a palindrome
    public boolean isPalindrome(String s) {
        int first = 0; //start index of string
        int second = s.length() - 1; //end index of string

        //In single pass we check each of the corresponding chars and see if they match properly
        while (first < second) {
            char firstChar = s.charAt(first);
            char secondChar = s.charAt(second);

            if (!Character.isLetterOrDigit(firstChar)) {
                first++;
            } else if (!Character.isLetterOrDigit(secondChar)) {
                second--;
            } else if (Character.toLowerCase(firstChar) != Character.toLowerCase(secondChar)) {
                return false;
            } else {
                first++;
                second--;
            }
        }

        return true;
    }
    public static void main(String[] args) {

    }
}
