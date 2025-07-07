// https://school.programmers.co.kr/learn/courses/30/lessons/120812?language=java
class Solution {
    public int solution(int[] array) {
        int[] counts = new int[1000];
        for( int n : array ) {
            counts[n]++;
        }
        
        int max = 0;
        boolean dup = false;
        for( int i = 1; i < counts.length; i++ ) {
            if( counts[max] == counts[i] ) {
                dup = true;
            } else if( counts[max] < counts[i] ) {
                dup = false;
                max = i;
            }
        }
        
        return dup? -1 : max;
    }
}