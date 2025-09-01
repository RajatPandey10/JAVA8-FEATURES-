package Method_Referance;

import java.util.Arrays;
import java.util.List;

public class Basics {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
          new Student("A",1213),
          new Student("B",1142),
          new Student("C",1153)
        );
        list.forEach(System.out::println); // this is known as method reference

    }
}

class Student{
    String name;
    int rollNo;

    Student(String name,int rollNo){
        this.name=name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString(){
        return "Name: "+name+", Roll No: "+rollNo;
    }

}
