package Java_practice;
import jdk.nio.mapmode.ExtendedMapMode;

class Employee{
    private String first_name;
    public String last_name;
    int age;
    public String Desig;

    Employee(){
        System.out.println("I am Default Constructor");
    }

    public String getFirst_name(String name){
        this.first_name=name;
        return name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public Employee(String firstname, String lastname, String Designation, int age){
        this.first_name = firstname;
        this.last_name = lastname;
        this.Desig = Designation;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Employee" + this.first_name + this.last_name + this.Desig + this.age;
    }
}
class EMP {
    public static void main(String[] args) {
        Employee e = new Employee();
        Employee e1 = new Employee(" Sarveshh ", "Arora ", "AMCTRAINEE ", 21 );
        System.out.println(e1);
        System.out.println(e1.getFirst_name(" Sarveshh "));
        e1.setFirst_name(" Yash ");
        System.out.println(e1);
    }
}