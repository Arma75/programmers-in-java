// https://school.programmers.co.kr/learn/courses/30/lessons/120904?language=java
class Solution {
    public int solution(int num, int k) {
        String[] arr = ("" + num).split("");
        for( int i = 0; i < arr.length; i++ ) {
            if( arr[i].equals(k + "") ) {
                return i + 1;
            }
        }
        return -1;
    }
}