// https://school.programmers.co.kr/learn/courses/30/lessons/120895?language=java
class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        
        char temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
        
        for( char c : arr ) {
            answer += c;
        }
        
        return answer;
    }
}