// https://school.programmers.co.kr/learn/courses/30/lessons/181914?language=java
class Solution {
    public int solution(String number) {
        int answer = 0;
        for( char c : number.toCharArray() ) {
            answer += Integer.parseInt("" + c);
        }
        return answer % 9;
    }
}