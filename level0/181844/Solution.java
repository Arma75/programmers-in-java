// https://school.programmers.co.kr/learn/courses/30/lessons/181844?language=java
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for( int n : arr ) {
            list.add(n);
        }
        for( int n : delete_list ) {
            list.remove(Integer.valueOf(n));
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}