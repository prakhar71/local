import java.util.*;
import java.util.stream.Collectors;

public class class1 {

    /*
    Write an Employee class with the following properties :

Id
Name
Age
Gender
Department
Year of joining

Given a List of Employees, perform the following actions using Java 8 features (Streams, Functional programming, Lambdas, Method References)

Get Names of Employees who joined after 2020. -
Find the count of male and female employees in the organization
Output: Male = <Count of male employees> , Female = <Count of female employees>
       3.Get the name of the highest experienced employee in the organization
    * */
    public static void main(String args[]) {
        Employee e1 = new Employee();e1.yearOfJoining=2017;e1.gender="F";e1.name="A";
        Employee e2 = new Employee();e2.yearOfJoining=2027;e2.gender="M";e2.name="B";
        Employee e3 = new Employee();e3.yearOfJoining=2021;e3.gender="F";e3.name="C";
        List<Employee> employeeList = new Vector<>();
        employeeList.add(e1);employeeList.add(e2);employeeList.add(e3);

       //List<Employee> list = employeeList.stream().filter(emp -> emp.yearOfJoining>2020).collect(Collectors.toList());

       // long femaleCount = employeeList.stream().filter(emp -> emp.gender == "F").count();
        Optional<Integer> highest =  employeeList.stream().map(x->x.yearOfJoining).collect(Collectors.minBy(Comparator.naturalOrder()));
        int age = highest.get();
        employeeList.stream().filter(e->e.age == age).collect(Collectors.toList());
    }


}

class Employee {
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
}
