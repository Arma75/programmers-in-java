// https://school.programmers.co.kr/learn/courses/30/lessons/181918?language=java
import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        
        for( int i = 0; i < arr.length; i++ ) {
            if( stk.size() > 0 && stk.lastElement() >= arr[i] ) {
                stk.pop();
                i--;
                continue;
            }
            
            if( stk.size() == 0 || stk.lastElement() < arr[i] ) {
                stk.push(arr[i]);
            }
        }
        
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}