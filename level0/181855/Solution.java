// https://school.programmers.co.kr/learn/courses/30/lessons/181855?language=java
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] arr = new int[100001];
        for( String str : strArr ) {
            arr[str.length()]++;
        }
        for( int i = 0; i < arr.length; i++ ) {
            if( answer < arr[i] ) {
                answer = arr[i];
            }
        }
        return answer;
    }
}