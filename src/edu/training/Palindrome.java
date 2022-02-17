package edu.training;

public class Palindrome {



    public static void main(String[] args) {
        String str = "bob";
        String reverse = reverse(str);

        if (str.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    private static String reverse(String str) {
        char[] chars = new char[str.length()];

        int count = 0;
        for (char ch : str.toCharArray()) {
            chars[str.length() - count - 1] = ch;
            count++;
        }
        return new String(chars);
    }
}
