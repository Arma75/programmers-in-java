// https://school.programmers.co.kr/learn/courses/30/lessons/120851?language=java
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.replaceAll("[a-zA-Z]", "").split("");
        for( String n : arr ) {
            answer += Integer.parseInt(n);
        }
        return answer;
    }
}