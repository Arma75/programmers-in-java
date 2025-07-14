// https://school.programmers.co.kr/learn/courses/30/lessons/181894?language=java
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        int s = -1;
        int e = -1;
        for( int i = 0; i < arr.length; i++ ) {
            if( arr[i] == 2 ) {
                if( e == -1 ) {
                    s = i;
                }
                e = i;
            }
        }
        
        if( s >= 0 ) {
            answer = new int[e - s + 1];
            for( int i = s; i <= e; i++ ) {
                answer[i - s] = arr[i];
            }
        }
        
        return answer;
    }
}