// https://school.programmers.co.kr/learn/courses/30/lessons/181905?language=java
class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        char[] arr = my_string.toCharArray();
        for( int i = s; i <= (e + s) / 2; i++ ) {
            char temp = arr[i];
            arr[i] = arr[e + s - i];
            arr[e + s - i] = temp;
        }
        
        for( char c : arr ) {
            answer += c;
        }
        
        return answer;
    }
}