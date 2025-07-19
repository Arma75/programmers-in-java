// https://school.programmers.co.kr/learn/courses/30/lessons/181915?language=java
class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for( int n : index_list ) {
            answer += my_string.charAt(n);
        }
        return answer;
    }
}