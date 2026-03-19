package jump2java;

import java.util.Arrays;
import java.util.HashSet;

public class Sample0305_14 {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
        HashSet<Integer> intersection = new HashSet<>(s1);  // s1으로 intersection 생성
        intersection.retainAll(s2);
        System.out.println(intersection);  // [4, 5, 6] 출력
    }
}
