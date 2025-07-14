// https://school.programmers.co.kr/learn/courses/30/lessons/181881?language=java
class Solution {
    public int solution(int[] arr) {
        int answer = -1;
        boolean bChange = true;
        while( bChange ) {
            bChange = false;
            
            for( int i = 0; i < arr.length; i++ ) {
                if( arr[i] >= 50 ) {
                    if( arr[i] % 2 == 0 ) {
                        arr[i] = arr[i] / 2;
                        bChange = true;
                    }
                } else {
                    if( arr[i] % 2 == 1 ) {
                        arr[i] = arr[i] * 2 + 1;
                        bChange = true;
                    }
                }
            }
            answer++;
        }
        
        return answer;
    }
}