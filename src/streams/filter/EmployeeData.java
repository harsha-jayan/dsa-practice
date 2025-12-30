package streams.filter;

import java.util.List;

public class EmployeeData {

    public static final List<Employee> EMP_LIST;

    static {
        EMP_LIST = List.of(
                new Employee(1,"Harsha1",31,5000),
                new Employee(2,"Harsha2",31,8999),
                new Employee(3,"Harsha3",24,8739),
                new Employee(4,"Harsha4",30,4567),
                new Employee(5,"Harsha5",28,9847)
        );
    }

}
