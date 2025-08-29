package Lambda_Expression;

import java.util.Arrays;
import java.util.List;

public class Lambda_Expression {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Rajat","Rohit","Rajeev","Rohan");

        Example example = (name)-> System.out.println("Hello, How are you "+name);
        students.forEach(example::Message);
    }
}

@FunctionalInterface
interface Example{
    void Message(String name);
}