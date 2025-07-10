// https://school.programmers.co.kr/learn/courses/30/lessons/120883?language=java
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        for( String[] row : db ) {
            if( id_pw[0].equals(row[0]) ) {
                if( id_pw[1].equals(row[1]) ) {
                    return "login";
                }
                
                return "wrong pw";
            }
        }
        
        return "fail";
    }
}