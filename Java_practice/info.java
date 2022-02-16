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
