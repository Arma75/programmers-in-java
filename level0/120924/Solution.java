// https://school.programmers.co.kr/learn/courses/30/lessons/120924?language=java
class Solution {
    public int solution(int[] common) {
        int v1 = common[1] - common[0];
        int v2 = common[2] - common[1];
        
        if( v1 == v2 ) {
            return common[common.length - 1] + v1;
        } else {
            return common[common.length - 1] * v2 / v1;
        }
    }
}