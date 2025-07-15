// https://school.programmers.co.kr/learn/courses/30/lessons/120864?language=java
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split("[a-zA-Z]");
        for( String s : arr ) {
            if( s.isEmpty() ) {
                continue;
            }
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}