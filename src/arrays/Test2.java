package arrays;

public class Test2 {
    public static void main(String[] args) {
        String s = "Harsha"; // String is immutable
        String ans= "";

        int N = s.length();

        for(int i=0;i<N;i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch<='Z'){
               ans = ans + (char)(ch+32); // each time a new string object is getting created in string pool -- highly un-optimal
                                                // why because string is immutable and first ans refers to "" this ans each time one character adds new string object is getting created in memory
            } else {
                ans = ans + (char)(ch-32);
            }
        }

        System.out.println(s.charAt(0));
        System.out.println(ans);

        //Palindrome - Malayalam
        //BF : string and reverse string compare
        String s1 = "This is a Book is";
        String s2 = "is";

        System.out.println(s1.lastIndexOf(s2));

        int firstTerm = 0;
        int secondTerm=1;
        for(int i=0; i<10;i++){
            if(i ==0 || i==1) System.out.print(i +",");
            int nextTerm = firstTerm+secondTerm;
            System.out.print(nextTerm+",");
            firstTerm = secondTerm;
            secondTerm= nextTerm;
        }


    }

}
