// https://school.programmers.co.kr/learn/courses/30/lessons/181885?language=java
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int size = 0;
        for( boolean finish : finished ) {
            if( !finish ) {
                size++;
            }
        }
        String[] answer = new String[size];
        int idx = 0;
        for( int i = 0; i < todo_list.length; i++ ) {
            if( !finished[i] ) {
                answer[idx++] = todo_list[i];
            }
        }
        return answer;
    }
}