// https://school.programmers.co.kr/learn/courses/30/lessons/181862?language=java
class Solution {
    public String[] solution(String myStr) {
        String[] arr = myStr.split("a|b|c");
        int size = 0;
        for( String str : arr ) {
            if( !str.isEmpty() ) {
                size++;
            }
        }
        String[] answer = new String[size];
        int i = 0;
        for( String str : arr ) {
            if( !str.isEmpty() ) {
                answer[i++] = str;
            }
        }
        
        return answer.length < 1? new String[]{"EMPTY"} : answer;
    }
}