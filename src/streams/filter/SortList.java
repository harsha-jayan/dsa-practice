package streams.filter;

import javax.print.attribute.standard.NumberUp;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,76,35,45,21,3);
        Collections.sort(numList);
        Collections.reverse(numList);

        System.out.println("first sort ::"+numList);

        //Internally uses TimSort, which is the same algorithm as Collections.sort()
        //TimSort needs extra space for merging


        //Sort this list in ascending order
        //Time Complexity: O(n log n)
        //Space Complexity: O(n)
        System.out.println("Ascending order :::");
        numList.stream().sorted().forEach(System.out::println);

        //Sort this list in descending order
        //Time Complexity: O(n log n)
        //Space Complexity: O(n)
        List<Integer> sortedDesc = numList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("Descending order :::");
        System.out.print(sortedDesc);


    }
}
