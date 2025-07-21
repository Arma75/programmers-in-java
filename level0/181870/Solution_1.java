// https://school.programmers.co.kr/learn/courses/30/lessons/181870?language=java
class Solution {
    public String[] solution(String[] strArr) {
        int size = 0;
        for( String str : strArr ) {
            if( str.indexOf("ad") < 0 ) {
                size++;
            }
        }
        
        String[] answer = new String[size];
        int idx = 0;
        for( String str : strArr ) {
            if( str.indexOf("ad") < 0 ) {
                answer[idx++] = str;
            }
        }
        
        return answer;
    }
}