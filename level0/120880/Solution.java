// https://school.programmers.co.kr/learn/courses/30/lessons/120880?language=java
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Integer[] wrapperNumlist = new Integer[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            wrapperNumlist[i] = numlist[i];
        }
        
        Arrays.sort(wrapperNumlist, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if( Math.abs(o1 - n) != Math.abs(o2 - n) ) {
                    return Math.abs(o1 - n) - Math.abs(o2 - n);
                } else {
                    return o2 - o1;
                }
            }
        });
        
        for( int i = 0; i < wrapperNumlist.length; i++ ) {
            answer[i] = wrapperNumlist[i];
        }
        
        return answer;
    }
}