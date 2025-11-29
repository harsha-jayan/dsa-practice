package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NobleInteger {
    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>(List.of(2,4,1,2,-1,5));
        Collections.sort(A);// TC O(NlogN)
        int count=0; // count of smaller elements
        int ans=0; // count of noble elements

        System.out.println(A);
        //Noble integers count = 2

        if(A.get(0) == 0) ans+=1;

        for(int i =1;i<A.size();i++){

            if(A.get(i) !=  A.get(i-1)) count=i; // previous count will be used for duplicate entries because we are not restting count anywhere in the logic

            if(A.get(i)==count) {
                System.out.print(A.get(i)+",");
                ans+=1;
            }
            }
        System.out.println("\n answer is ::"+ans);
        int x = 10;
        int y=11;
        System.out.println(~x);
        System.out.println(x&y);

    }
}
