// https://school.programmers.co.kr/learn/courses/30/lessons/181926?language=java
class Solution {
    public int solution(int n, String control) {
        for( char c : control.toCharArray() ) {
            if( c == 'w' ) {
                n++;
            } else if( c == 's' ) {
                n--;
            } else if( c == 'd' ) {
                n += 10;
            } else if( c == 'a' ) {
                n -= 10;
            }
        }
        return n;
    }
}