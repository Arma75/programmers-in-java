// https://school.programmers.co.kr/learn/courses/30/lessons/181872?language=java
class Solution {
    public String solution(String myString, String pat) {
        return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
    }
}