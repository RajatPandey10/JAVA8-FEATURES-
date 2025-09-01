package Functional_Interface;

/*
Imagine you’re building a banking app. You have a list of customers, and you want to:
Filter customers based on some condition (like balance > 5000).
Sort customers by name.
Print a greeting message for each customer.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class RealWorldExample {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer("Rohit",70),
                new Customer("Abhijeet",90000)
        );

        // Predicate<T> -> takes T, returns boolean (filter condition)
        Predicate<Customer> hasHighBalance = (balance)-> balance.balance>5000;

        // Comparator<T> -> functional interface for sorting
        customers.sort(Comparator.comparing(c->c.name));

        // Consumer<T> -> takes T, returns void (printing message)
        Consumer<Customer> greet = c ->
                System.out.println("Hello " + c.name + ", your balance is: " + c.balance);

        customers.stream()
                .filter(hasHighBalance)
                .forEach(greet);
    }
}


class Customer {
    String name;
    int balance;

    Customer(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
}