// https://school.programmers.co.kr/learn/courses/30/lessons/120911?language=java
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] arr = my_string.split("");
        for( int i = 0; i < arr.length; i++ ) {
            arr[i] = arr[i].toLowerCase();
        }
        
        for( int i = 0; i < arr.length; i++ ) {
            for( int j = i + 1; j < arr.length; j++ ) {
                if( arr[i].compareTo(arr[j]) > 0 ) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for( String str : arr ) {
            answer += str.toLowerCase();
        }
        
        return answer;
    }
}