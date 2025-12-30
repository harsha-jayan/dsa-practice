package streams.filter;

import java.util.*;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        // Q. Find the longest string in a list of strings using Java streams

        List<String> listOfStrings = Arrays.asList("Malayalam","English","Japan");

        Optional<String> longestString = listOfStrings.stream()
                .distinct()
                .max(Comparator.comparingInt(String::length));

        System.out.println(longestString.orElse(""));

        // Q2 : Employee with highest salary

        Optional<Employee> highPaidEmp = EmployeeData.EMP_LIST
                .stream()
                .max(Comparator.comparingInt(Employee::getSalary));

        System.out.println(highPaidEmp);

        // Q3 : Maximum frequency number in a list of numbers

        List<Integer> nums = Arrays.asList(1, 2, 3, 3, 2, 2, 5);


        //count of distinct element - using stream
        System.out.println(nums.stream().distinct().count());

        // Average age of Employees

        double avgAge = EmployeeData.EMP_LIST
                .stream()
                .mapToInt(Employee::getAge)
                .average().
                orElse(0);

        System.out.println(avgAge);

        // Q. Check if a list of integers contains a prime number

        List<Integer> numList = Arrays.asList(1,3,4);
        boolean isPrimePresent = numList.stream()
                .anyMatch(e -> {
                    if(e<=1) return false;

                    for(int i=2; i <= Math.sqrt(e); i++){
                        if(e % i == 0) return false;
                    }

                    return true;
                });

        System.out.println("Prime number is present in the list :: "+isPrimePresent);

        // Q: intersection of two lists

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

        List<Integer> list3 = Arrays.asList(3, 4);

        list1.stream()
                .filter(list2::contains)
                .toList()
                .forEach(System.out::println);

        // Q:: Remove duplicates from a list while preserving the order
        List<Integer> list4 = Arrays.asList(1, 2,2, 3, 4, 5,5,6,6,6);

        // adding this list to a set can remove duplicates but it won't guarantee order
        // BF : stream over the list, filter duplicate entry

        List<Integer> list5 = list4.stream().distinct().toList();
        System.out.println(list5);

        // Q:: Unique names

        List<String> names = Arrays.asList("Amit", "Riya", "Rohan", "Amit");

        // Collect into Set (removes duplicates)
        Set<String> uniqueNames = names.stream().collect(Collectors.toSet()); // use distinct
        System.out.println(uniqueNames);

        names.stream().filter(n -> n.startsWith("A")).forEach(System.out::println);

        //reduce : terminal trigger
        List<Integer> list6 =  Arrays.asList(1, 2, 3, 4, 5,6,7,8,1,10);

        /*int sum = list6.stream()
                .reduce(0, (a, b) -> a + b);*/

        //System.out.println(sum);

        list6.parallelStream()
                .filter(e -> e % 2 == 0)
                .forEachOrdered(System.out::println);



    }

    boolean isPrime(Integer number){

        if(number<=1) return false;

        for(int i=2; i < Math.sqrt(number); i++){
            if(number % i == 0) return false;
        }

        return true;

    }
}
