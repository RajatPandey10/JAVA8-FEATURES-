package Method_Referance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting_List {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList
                ("India","England","Nepal","Russia","Australia","New Zealand","Africa");

        // sorting using lambda
    /*    countries.sort((a,b)->a.compareToIgnoreCase(b));
        countries.forEach(System.out::println);

     */

        countries.sort(String::compareToIgnoreCase);
        countries.forEach(System.out::println);

    }
}
