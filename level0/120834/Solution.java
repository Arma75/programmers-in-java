// https://school.programmers.co.kr/learn/courses/30/lessons/120834?language=java
class Solution {
    public String solution(int age) {
        String answer = "";
        while( age > 0 ) {
            answer = (char)(age % 10 + 97) + answer;
            age /= 10;
        }
        return answer;
    }
}