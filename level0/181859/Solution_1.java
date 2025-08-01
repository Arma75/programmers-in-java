// https://school.programmers.co.kr/learn/courses/30/lessons/181859?language=java
import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for( int i = 0; i < arr.length; i++ ) {
            if( stk.isEmpty() || stk.lastElement() != arr[i] ) {
                stk.push(arr[i]);
            } else if( !stk.isEmpty() && stk.lastElement() == arr[i] ) {
                stk.pop();
            }
        }
        
        return stk.size() == 0? new int[]{-1} : stk.stream().mapToInt(Integer::intValue).toArray();
    }
}