// https://school.programmers.co.kr/learn/courses/30/lessons/181919?language=java
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        int[] arr = IntStream.iterate(n, i -> i % 2 == 0? i / 2 : 3 * i + 1).takeWhile(i -> i != 1).toArray();
        int[] answer = new int[arr.length + 1];
        System.arraycopy(arr, 0, answer, 0, arr.length);
        answer[arr.length] = 1;
        
        return answer;
    }
}