// https://school.programmers.co.kr/learn/courses/30/lessons/181878?language=java
class Solution {
    public int solution(String myString, String pat) {
        return myString.toLowerCase().indexOf(pat.toLowerCase()) > -1? 1 : 0;
    }
}