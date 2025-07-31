// https://school.programmers.co.kr/learn/courses/30/lessons/181867?language=java
class Solution {
    public int[] solution(String myString) {
        String[] arr = (myString + " ").split("x");
        int[] answer = new int[arr.length];
        for( int i = 0; i < arr.length; i++ ) {
            answer[i] = arr[i].trim().length();
        }
        return answer;
    }
}