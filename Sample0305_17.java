package jump2java;

import java.util.Arrays;
import java.util.HashSet;

public class Sample0305_17 {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        HashSet<Integer> subtract = new HashSet<>(s1);  // s1으로 subtract 생성
        subtract.removeAll(s2); // 차집합 수행
        System.out.println(subtract);  // [1, 2, 3] 출력
    }
}
