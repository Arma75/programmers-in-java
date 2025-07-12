// https://school.programmers.co.kr/learn/courses/30/lessons/181837?language=java
class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for( String o : order ) {
            if( o.contains("cafelatte") ) {
                answer += 5000;
            } else {
                answer += 4500;
            }
        }
        return answer;
    }
}