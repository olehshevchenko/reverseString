package Oleh.Shevchenko;

public class Main {

    public static void main(String[] args) {
        String stringOrigin = "java introduce ";
        String reverse = reverseString(stringOrigin);
        StringBuilder upCase = new StringBuilder();
        for (int i = 1; i < reverse.length() ; i++) {
            if (" ".equals(reverse.substring(i - 1, i))) {
                upCase.append(reverse.substring(i, i + 1).toUpperCase());
            }
            else {
                upCase.append(reverse.charAt(i));
            }
        }
        System.out.println("Reversed string is: " + upCase);
    }

    public static String reverseString(String input) {
        StringBuilder resultString = new StringBuilder();
        char[] stringToChar = input.toCharArray();
        for (int i = stringToChar.length - 1; i >= 0; i--) {
            resultString.append(stringToChar[i]);
        }
        return resultString.toString();
    }
}