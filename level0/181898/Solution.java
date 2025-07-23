// https://school.programmers.co.kr/learn/courses/30/lessons/181898?language=java
// 문제에는 idx보다 큰 인덱스를 찾으라고 적혀있는데 입출력 예 3번은 idx와 동일한 값을 결과값으로 출력하고 있다.
// idx보다 큰 인덱스가 아니라 idx보다 크거나 같은 인덱스를 찾길 바랬던것 같다.
class Solution {
    public int solution(int[] arr, int idx) {
        for( int i = idx; i < arr.length; i++ ) {
            if( arr[i] == 1 ) {
                return i;
            }
        }
        return -1;
    }
}