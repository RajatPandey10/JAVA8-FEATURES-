package Functional_Interface;

import java.util.Arrays;
import java.util.List;

public class Basics {

    public static void main(String[] args) {

        List<Bank> users = Arrays.asList
                (new Bank("Rajat","123RAJ"),
                    new Bank("Rohit","564ROH")
                );

        GetMessage getMessage = (a,b)->
                System.out.print("Hello "+a+" Account Number: "+b+" Welcome again");

        users.forEach(user-> getMessage.getMessage(user.name, user.AccountNumber));
    }
}


@FunctionalInterface
interface GetMessage{
    void getMessage(String name,String AccountNumber);
}

class Bank{
    String name;
    String AccountNumber;

    Bank(String name, String AccountNumber){
        this.AccountNumber=AccountNumber;
        this.name=name;
    }


}