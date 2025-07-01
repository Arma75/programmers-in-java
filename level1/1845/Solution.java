// https://school.programmers.co.kr/learn/courses/30/lessons/1845?language=java
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for( int n : nums ) {
            set.add(n);
        }
        
        return Math.min(set.size(), nums.length / 2);
    }
}