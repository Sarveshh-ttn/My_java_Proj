/*
Q1) Write a class with FirstName, LastName & age field. Print Firstname, LastName & age using static block, static method & static variable respectively.
*/


package Java_practice;

public class info {
        static int age = 21;
        static{
            System.out.println("Sarveshh");
        }
        public static void lastname(){
            System.out.println("Arora");
        }
    }

    class Details {
        public static void main(String[] args) {
            info.lastname();
            System.out.println("My age is " + info.age);
        }

}
