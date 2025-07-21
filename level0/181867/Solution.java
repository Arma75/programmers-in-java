// https://school.programmers.co.kr/learn/courses/30/lessons/181867?language=java
class Solution {
    public int[] solution(String myString) {
        int size = 0;
        for( char c : myString.toCharArray() ) {
            if( c == 'x' ) {
                size++;
            }
        }
        int[] answer = new int[size + 1];
        String[] arr = myString.split("x");
        for( int i = 0; i < arr.length; i++ ) {
            answer[i] = arr[i].length();
        }
        return answer;
    }
}