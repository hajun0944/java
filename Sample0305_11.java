package jump2java;

import java.util.HashMap;

public class Sample0305_11 {
    public static void main(String[] args) {
    	HashMap<String, String> map = new HashMap<>();
    	map.put("people", "사람");
    	map.put("baseball", "야구");
    	System.out.println(map.remove("people")); // "사람" 출력
    	System.out.println(map.size());

    }
}
