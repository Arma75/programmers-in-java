// https://school.programmers.co.kr/learn/courses/30/lessons/120871?language=java
class Solution {
    public boolean isThree(int n) {
        String s = String.valueOf(n);
        for( char c : s.toCharArray() ) {
            if( c == '3' ) {
                return true;
            }
        }
        
        return n % 3 == 0;
    }
    
    public int solution(int n) {
        int answer = 0;
        
        while( n > 0 ) {
            answer++;
            
            while( isThree(answer) ) {
                answer++;
            }
            n--;
        }
        
        return answer;
    }
}