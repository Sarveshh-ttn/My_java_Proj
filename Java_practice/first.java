/*
Q2) Write a program to read user input until user writes XDONE and then show the entered text by the user on commandline
*/


package Java_practice;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = "";
        String s ="";
        while (!x.equals("XDONE")){
            x = sc.next();
            if(x.equals("XDONE")){
            }
            else{
                s = s + " " + x;
            }
        }
        System.out.println(s);
    }
}
