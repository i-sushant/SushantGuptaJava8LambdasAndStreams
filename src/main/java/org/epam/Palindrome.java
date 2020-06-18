package org.epam;
import java.util.*;

public class Palindrome {
    private static boolean isPalindrome(String string) {
        int i = 0;
        int j = string.length() - 1;
        String tempString = string.toLowerCase();
        while(i < j) {
            if(tempString.charAt(i) != tempString.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public String[] getPalindromes(String ...args) {
        if(args.length == 0) return new String[0];
        return Arrays.stream(args)
                .filter(Palindrome::isPalindrome)
                .toArray(String[]::new);
    }
}
