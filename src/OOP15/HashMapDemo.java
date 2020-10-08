package OOP15;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, Integer> mountains = new HashMap<String, Integer>();
        mountains.put("Everest",29029);
        mountains.put("K2",28169);
        mountains.put("halla",7000);

        //넣은거 출력해주기. 메서드 사용해서....

        printMap(mountains);

        //제거해보기
        // mountains.remove("k2");
    }
public static void printMap(HashMap<String, Integer> map){
    System.out.println("Map contains:");
    for(String keymountain : map.keySet()) //hashmap을 set으로 전환해야 된다 String인지 Integer인지 알수가 없어서...
    {
        Integer height = map.get(keymountain);
        System.out.println(keymountain + "-->>" + height.intValue() + " feet.");

    }
}
}
