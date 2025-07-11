// https://school.programmers.co.kr/learn/courses/30/lessons/181913?language=java
class Solution {
    public String solution(String my_string, int[][] queries) {
        for( int[] query : queries ) {
            String s1 = my_string.substring(0, query[0]);
            String s2 = my_string.substring(query[0], query[1] + 1);
            String s3 = my_string.substring(query[1] + 1);
            
            my_string = s1 + new StringBuffer(s2).reverse().toString() + s3;
        }
        return my_string;
    }
}