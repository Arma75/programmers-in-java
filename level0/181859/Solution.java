// https://school.programmers.co.kr/learn/courses/30/lessons/181859?language=java
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for( int i = 1; i < arr.length; i++ ) {
            if( list.size() > 0 && list.get(list.size() - 1) == arr[i] ) {
                list.remove(list.size() - 1);
            } else {
                list.add(arr[i]);
            }
        }
        
        return list.size() == 0? new int[]{-1} : list.stream().mapToInt(Integer::intValue).toArray();
    }
}