// https://school.programmers.co.kr/learn/courses/30/lessons/181864?language=java
class Solution {
    public int solution(String myString, String pat) {
        String target = "";
        for( char c : pat.toCharArray() ) {
            if( c == 'A' ) {
                target += "B";
            } else {
                target += "A";
            }
        }
        
        return myString.indexOf(target) > -1? 1 : 0;
    }
}