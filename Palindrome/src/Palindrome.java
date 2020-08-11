import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Palindrome {
    static boolean canFormPalindrome(String str) {
        str = str.replaceAll("\\s+",""); //remove white space
        str = str.replaceAll("[^a-zA-Z ]", ""); //removes all punctuation
        str = str.toUpperCase();

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (list.contains(str.charAt(i)))
                list.remove((Character) str.charAt(i));
            else
                list.add(str.charAt(i));
        }

        return str.length() % 2 == 0 && list.isEmpty() // if string length is even
                || (str.length() % 2 == 1 && list.size() == 1);
    }
    public static void main(String[] args) throws IOException {

        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter the number of words you wanna check:\n");
        int num = user_input.nextInt();
        int i,j;
        String[] strArray = new String[num];
        System.out.println("Please Enter the Words:\n");
        for (i = 0; i < num; i++) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            strArray[i] = input;
        }

        for(j=0; j < num; j++) {
            if (canFormPalindrome(strArray[j])) {
                System.out.println("Palindrome:" + strArray[j]);
            } else {
                System.out.println("No Palindrome:" + strArray[j]);
            }
        }
    }
}


