// https://school.programmers.co.kr/learn/courses/30/lessons/181900?language=java
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        for( int i = 0; i < my_string.length(); i++ ) {
            boolean bContain = false;
            for( int j = 0; j < indices.length; j++ ) {
                if( indices[j] == i ) {
                    bContain = true;
                    break;
                }
            }
            
            if( !bContain ) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}