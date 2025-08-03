// https://school.programmers.co.kr/learn/courses/30/lessons/181858?language=java
import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] arr1 = IntStream.generate(() -> -1).limit(k).toArray();
        int[] arr2 = Arrays.stream(arr).distinct().toArray();
        
        System.arraycopy(arr2, 0, arr1, 0, Math.min(arr1.length, arr2.length));
        
        return arr1;
    }
}