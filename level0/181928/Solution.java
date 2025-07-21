// https://school.programmers.co.kr/learn/courses/30/lessons/181928?language=java
class Solution {
    public int solution(int[] num_list) {
        int sum1 = 0;
        int sum2 = 0;
        for( int i = 0; i < num_list.length; i++ ) {
            if( num_list[i] % 2 == 1 ) {
                sum1 = sum1 * 10 + num_list[i];
            } else {
                sum2 = sum2 * 10 + num_list[i];
            }
        }
        return sum1 + sum2;
    }
}