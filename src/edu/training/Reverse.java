package edu.training;

public class Reverse {

    public static void main(String[] args) {
        String str = "Audintel";
        char[] chars = new char[str.length()];

        int count = 0;
        for (char ch: str.toCharArray()) {
            chars[str.length() - count - 1] = ch;
            count++;
        }
        String reverse = new String(chars);
        System.out.println(reverse);
    }

}
