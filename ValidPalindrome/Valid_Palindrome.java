package ValidPalindrome;

import java.util.Scanner;

public class Valid_Palindrome {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String word = scanner.nextLine();

        System.out.println("1. Special char, 2. No special char: ");
        int opc = scanner.nextInt();

        if(opc == 1){
            isPalindromeNoSpecialChar(word);
        } else {
            isPalindrome(word);
        }       

        System.out.println("is palindrome ?: " + isPalindromeNoSpecialChar(word).toString());

        scanner.close();
    }

    public static Boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(Character.toLowerCase(i++) != Character.toLowerCase(j--)){
                return false;
            }
        }
        return true;
    }

    public static Boolean isPalindromeNoSpecialChar(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i < j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--))){
                return false;
            }
        }
        return true;
    }
}
/* We want to walk trough the word so we only compare the pairs at the beginning and at the end, the first two conditions are only to 
 * ensure that we only compare alphabetical characters
 */
