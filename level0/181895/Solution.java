// https://school.programmers.co.kr/learn/courses/30/lessons/181895?language=java
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        for( int[] interval : intervals ) {
            for( int i = interval[0]; i <= interval[1]; i++ ) {
                list.add(arr[i]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}