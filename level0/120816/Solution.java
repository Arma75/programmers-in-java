// https://school.programmers.co.kr/learn/courses/30/lessons/120816?language=java
class Solution {
    public int solution(int slice, int n) {
        return (int)Math.ceil(n / (float)slice);
    }
}