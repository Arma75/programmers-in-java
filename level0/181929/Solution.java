// https://school.programmers.co.kr/learn/courses/30/lessons/181929?language=java
class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;
        for( int n : num_list ) {
            sum += n;
            mul *= n;
        }
        return mul < Math.pow(sum, 2)? 1 : 0;
    }
}