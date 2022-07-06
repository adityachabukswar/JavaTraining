/*  Write a program that computes your initials from your full name and displays them
*/

import java.util.Scanner;

public class Name
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a name of 3 or more words:");
        String str = in.nextLine();
        int len = str.length();

        System.out.print(str.charAt(0) + " ");
        for (int i = 1; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                char ch2 = str.charAt(i + 1);
                System.out.print(ch2 + " ");
            }
        }
    }
}