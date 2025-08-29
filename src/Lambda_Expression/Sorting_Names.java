package Lambda_Expression;


import java.util.*;

public class Sorting_Names {
    public static void main(String[] args) {
        List<String> students = Arrays.asList
                ("Rajeev","Deepak","Rohit","Anuj","Abhishek","Binod");
        System.out.println("Unsorted students: "+students);

        // sorting the names using comparator
        Collections.sort(students, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println("Sorted Students: "+students);


        // sorting names in list using lambda expression
        List<String> names = Arrays.asList
                ("Rishi","Deepali","Roshan","Anjali","Zoya","Ankit");
        System.out.println("Unsorted Names: "+names);

        Collections.sort(names, (a,b)-> a.compareTo(b));
        System.out.println("Sorted names: "+names);
    }
}
