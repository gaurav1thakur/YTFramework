package org.testng.Conceptual;

public class StringPrograms {
    public static void main(String[] args) {

        //Problem 1: String is verifyPalindrome or not
        //Problem 2:  my name is gaurav  convert to - gaurav is name my
        //Problem 3: my name is gaurav -> ym eman si varuag
        //Problem 4: my name is gaurav -> varuag si eman ym
        //Problem 5: my name is gaurav -> occurrence of a
        //10101010 -> 11110000

        //non palindrome string
        verifyPalindrome("gaurav");
        System.out.println(" ");

        //palindrome string
        verifyPalindrome("nitin");
        System.out.println(" ");

        //reverse string array after split
        reverseStringAfterSplit("My name is GaruaV");
        System.out.println(" ");

        reverseSubstringsAfterSplit("My name is GaruaV");
        System.out.println(" ");

        reverseStringreverserSubstring("My name is GaruaV");
        System.out.println(" ");


        findOccurance("My name is Gaurav", 'a');
        System.out.println(" ");

        sortBinaryInString("101010101");
        System.out.println(" ");
    }



    //Problem 1: String is verifyPalindrome or not eg (nitin  same as left to right, right to left)
    public static void verifyPalindrome(String string) {
        string = string.toLowerCase();
        //String palindrome = "";
        String palindrome = new String();
        for (int i = string.length() - 1; i >= 0; i--) {
            palindrome = palindrome + string.charAt(i);
            System.out.println(palindrome);
        }
        if (string.equals(palindrome)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
    }

    public static void reverseStringAfterSplit(String string) {
        string = string.toLowerCase();
        String[] st = string.split(" ");
        for (int i = st.length - 1; i >= 0; i--) {
            System.out.print(" " + st[i]);
        }
    }

    public static void reverseSubstringsAfterSplit(String string) {
        string = string.toLowerCase();
        String[] st = string.split(" ");
        for (int i = 0; i < st.length; i++) {

            reverseString(st[i]);
            //  System.out.print("  1:  "+ i);
        }
    }

    public static void reverseStringreverserSubstring(String string) {
        string = string.toLowerCase();
        reverseString(string);
        // reverseSubstringsAfterSplit(string);
    }

    public static void reverseString(String string) {
        String rev = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            rev = rev + string.charAt(i);
        }
        System.out.print(" " + rev);
    }

    public static void findOccurance(String string, char ch) {
        string = string.toLowerCase();
        int flag = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ch) {
                flag++;
            }
        }
        System.out.print("Count of character " + ch + "given is :" + flag);
    }

    public static void sortBinaryInString(String string) {
        int flag1 = 0, flag0 = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '1') {
                flag1++;
            } else {
                flag0++;
            }
        }
        for (int i = 0; i < flag1; i++) {
            System.out.print("1");
        }
        for (int i = 0; i < flag0; i++) {
            System.out.print("0");
        }
    }

}


