package arrays;

//Problem : Find
// Bruteforce Time Complexity O(n) = n2
//Optimal Solution O(n) = n

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String args[]){
        int[] arr = {2,4,12,17,8,5};
        int target = 20;
        int[] answer = new int[2];
        Map<Integer, Integer> map = new HashMap();

        for(int i=0;i< arr.length;i++){
            int secondNumber = target - arr[i];

            if(map.containsKey(secondNumber)) {
                answer[0] = map.get(secondNumber);
                answer[1] = i;
                break;
            }
            map.put(arr[i],i);
        }
        System.out.println(answer[0]+","+answer[1]);
    }
}