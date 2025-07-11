// https://school.programmers.co.kr/learn/courses/30/lessons/181918?language=java
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        stk.add(arr[0]);
        
        for( int i = 1; i < arr.length; i++ ) {
            if( stk.size() > 0 && stk.get(stk.size() - 1) >= arr[i] ) {
                while( stk.size() > 0 && stk.get(stk.size() - 1) >= arr[i] ) {
                    stk.remove(stk.size() - 1);
                }
            }
            
            stk.add(arr[i]);
        }
        
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}