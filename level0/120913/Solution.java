// https://school.programmers.co.kr/learn/courses/30/lessons/120913?language=java
class Solution {
    public String[] solution(String my_str, int n) {
        int len = (int)Math.ceil(my_str.length() / (double)n);
        String[] answer = new String[len];
        for( int i = 0; i < len; i++ ) {
            answer[i] = "";
            for( int j = 0; j < n && i * n + j < my_str.length(); j++ ) {
                answer[i] += my_str.charAt(i * n + j);
            }
        }
        return answer;
    }
}