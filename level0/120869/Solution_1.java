// https://school.programmers.co.kr/learn/courses/30/lessons/120869?language=java
class Solution {
    public int solution(String[] spell, String[] dic) {
        for( String d : dic ) {
            int count = 0;
            for( String s : spell ) {
                if( d.contains(s) ) {
                    count++;
                }
            }
            if( count == d.length() && count == spell.length ) {
                return 1;
            }
        }
        return 2;
    }
}