// https://school.programmers.co.kr/learn/courses/30/lessons/181900?language=java
class Solution {
    public String solution(String my_string, int[] indices) {
        boolean[] removeIndexes = new boolean[my_string.length()];
        for( int i : indices ) {
            removeIndexes[i] = true;
        }
        
        String answer = "";
        for( int i = 0; i < my_string.length(); i++ ) {
            if( !removeIndexes[i] ) {
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}