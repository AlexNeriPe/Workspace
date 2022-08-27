package ReverseString;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter a string: ");
        String word = scanner.nextLine();
        
        System.out.println("The reverse word is: " + reverse(word));

        scanner.close();
    }

    private static String reverse(String s){
        char[] characters = new char[s.length()];       //create an array with the size of the string
        int j = 0;
        for(int i = s.length() - 1 ; i >= 0 ; i--){     //for inverse
            characters[j++] = s.charAt(i);              //assign the characters invert
        }
        return new String(characters);                  //creating new object string from the string array
    }
}
