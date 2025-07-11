// https://school.programmers.co.kr/learn/courses/30/lessons/181934?language=java
class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean[][] results = {{n >= m, n > m}, {n <= m, n < m}};
        return results[ineq.equals(">")? 0 : 1][eq.equals("=")? 0 : 1]? 1 : 0;
    }
}