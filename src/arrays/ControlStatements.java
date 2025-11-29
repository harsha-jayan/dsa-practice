package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ControlStatements {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(23,45,65,8));

        for(Integer i: nums){
            System.out.print(i +",");
        }

    }
}
