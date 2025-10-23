package streams.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNames {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Thomas";
        names[1] = "Anita";
        names[2] = "Jacob";
        names[3] = "John";
        // String[] names = {"Thomas", "Anita","Jacob", "John" }'

        // Filter names that start with J without stream API
        // Time complexity O(N)
        //space complexity O(1)
        for (int i = 0; i<names.length;i++){
            if(names[i].startsWith("J")) System.out.println(names[i]);
        }

        // Java 8 stream API - stream works on collections
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        Arrays.stream(names).filter(i -> i.startsWith("T")).forEach(System.out::println);

        // Time Complexity: O(n)
        // Space Complexity: O(n) - creating a new list at the end
        Arrays.stream(names).filter(i -> i.startsWith("T")).collect(Collectors.toList());


        // Throws UnsupportedOperationException since myNameList is an array list with fixed size of 4
        /*List myNamesList = Arrays.asList(names);
        myNamesList.add(4,"Arjun");*/

        //Below array list is mutable hence no error
        List myNameList2 = new ArrayList<>(Arrays.asList(names));
        myNameList2.add("Hema");
        myNameList2.forEach(System.out::println);


    }
}
