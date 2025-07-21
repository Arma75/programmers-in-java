// https://school.programmers.co.kr/learn/courses/30/lessons/181842?language=java
class Solution {
    public int solution(String str1, String str2) {
        for( int i = 0; i <= str2.length() - str1.length(); i++ ) {
            String str = str2.substring(i, i + str1.length());
            if( str.equals(str1) ) {
                return 1;
            }
        }
        return 0;
    }
}