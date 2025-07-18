// https://school.programmers.co.kr/learn/courses/30/lessons/181923?language=java
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for( int i = 0; i < queries.length; i++ ) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            int min = 1000001;
            for( int j = s; j <= e; j++ ) {
                if( arr[j] < min && arr[j] > k ) {
                    min = arr[j];
                }
            }
            
            answer[i] = min > 1000000? -1 : min;
        }
        return answer;
    }
}