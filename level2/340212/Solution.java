// https://school.programmers.co.kr/learn/courses/30/lessons/340212
class Solution {
    public long calcDuration(int[] diffs, int[] times, int level) {
        long duration = 0;
        for( int i = 0; i < diffs.length; i++ ) {
            int diff = diffs[i];
            int time_cur = times[i];
            int time_prev = i > 0? times[i - 1] : 0;

            if( diff <= level ) {
                duration += time_cur;
            } else {
                duration += (time_cur + time_prev) * (diff - level) + time_cur;
            }
        }
        
        return duration;
    }
    
    public int solution(int[] diffs, int[] times, long limit) {
        int answer = 0;
        
        int max = 0;
        for( int diff : diffs ) {
            if( diff > max ) {
                max = diff;
            }
        }
        
        int left = 0;
        int right = max;

        while( left <= right ) {
            int mid = left + (right - left) / 2;
            long duration = calcDuration(diffs, times, mid);

            if( duration > limit ) {
                left = mid + 1;
            } else {
                answer = mid;
                right = mid - 1;
            }
        }
        
        return Math.max(1, answer);
    }
}