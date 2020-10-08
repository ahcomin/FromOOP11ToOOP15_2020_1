package OOP15;

import java.util.HashSet;
/*
HastSet은 언제 쓰는게 좋을까?

==>  인증기관.
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> intset = new HashSet<Integer>();

        //add 2,7,7,3 to the set
        intset.add(2);
        intset.add(7);
        intset.add(7);
        intset.add(3);

        printSet(intset);
        //sout(intset);

        intset.remove(3);
        printSet(intset);
    }
    public static void printSet(HashSet<Integer> set){
        System.out.println("The set contains");
        //for-each
        //set.toArray() ==> Object[]
        //for(Object obj : set.toArray()){


        for (Object obj : set.toArray()){
            Integer num = (Integer)obj;
            System.out.println(num.intValue());
        }
    }
}
