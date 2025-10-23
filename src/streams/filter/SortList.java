package streams.filter;

import javax.print.attribute.standard.NumberUp;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,76,35,45,21,3);

        //Sort this list in ascending order
        System.out.println("Ascending order :::");
        numList.stream().sorted().forEach(System.out::println);

        //Sort this list in descending order
        List<Integer> sortedDesc = numList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("Descending order :::");
        System.out.print(sortedDesc);

    }
}
