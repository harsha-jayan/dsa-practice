/*
package streams.filter;

import java.util.*;
import java.util.stream.Collectors;

public class MainClass {

    static List<Employee> empList = List.of(
            new Employee(1,"Harsha1",31,5000),
            new Employee(2,"Harsha2",31,8999),
            new Employee(3,"Harsha3",24,8739),
            new Employee(4,"Harsha4",30,4567),
            new Employee(5,"Harsha5",28,9847)
    );
    public static void main(String[] args) {

        Map<Integer,List<Employee>> groupedByAge = empList
                                                   .stream()
                .collect(Collectors.groupingBy(Employee::getAge));

        groupedByAge.forEach( (age,employees) -> {
            System.out.println("Age: "+age);
            employees.forEach(e-> System.out.println(" - " + e.getName()));
        });


        //empList.stream().sorted().forEach(System.out::println);

        //empList.stream().filter(i -> i.getAge()>25).forEach(System.out::println);

        List<Employee> sortedList = empList
                .stream()
                .sorted(Comparator.comparing((Employee::getAge)).thenComparing(Comparator.comparing(Employee::getId)))
                .toList();

        sortedList.forEach(System.out::println);

        HashMap<Integer, List<Employee>> map = new HashMap<>();

//        empList.stream().map(i -> {
//            if (i.getAge()>25){
//                List<Employee> list = new ArrayList<>();
//                list.add(i);
//            }
//        }).forEach(System.out::println);


        int min1 = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .min()
                .orElse(0);

        System.out.println(min1);

        Map<String, List<String>> people = new HashMap<>();
        people.put("John", Arrays.asList("555-1123", "555-3389"));
        people.put("Mary", Arrays.asList("555-2243", "555-5264"));
        people.put("Steve", Arrays.asList("555-6654", "555-3242"));

        List<String> phones = people.values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        phones.forEach(System.out::println);



    }
}
*/
