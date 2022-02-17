/*
3) Write a java program to show following menu to the user:

*******Menu*******
1. Calculate Area of Circle
2. Calculate Circumference of a Circle
3. Exit.
Choose an option (1-3): 

Take radius as user input.

Hint: Use Switch statement to act on the menu. Also area and circumference methods should be static

*/



package Java_practice;
import java.util.Scanner;
public class NewCircle {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double pi = 3.14;
            System.out.println("Select any One \n 1.Area \n 2.Circumference \n 3.Exit");
            int opt = sc.nextInt();
            System.out.println("Enter Radius");
            int r = sc.nextInt();
            menu(pi, opt, r);
        }

        public static void menu(double pi, int opt, int r) {
            switch (opt) {
                case 1:
                    System.out.println(area(pi, r));
                    break;
                case 2:
                    System.out.println(circumference(pi, r));;
                    break;
                case 3:
                    System.out.println("Exiting");
                    return;
                default:
                    return;
            }
        }
        public static double area(double pi, int r){
            double area = pi * r * r;
            return area;
        }
        public static double circumference(double pi, int r){
            double circumference = 2 * pi * r;
            return circumference;
        }

}
