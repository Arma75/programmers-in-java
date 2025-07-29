// https://school.programmers.co.kr/learn/courses/30/lessons/181939?language=java
class Solution {
    public int solution(int a, int b) {
        int n1 = Integer.parseInt(a + "" + b);
        int n2 = Integer.parseInt(b + "" + a);
        return Math.max(n1, n2);
    }
}