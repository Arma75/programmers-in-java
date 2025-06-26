class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = schedules.length;
        
        for( int i = 0; i < schedules.length; i++ ) {
            int time = schedules[i] + 10;
            int hour = time / 100 + (time % 100 / 60);
            int minute = time % 100 % 60;
            
            for( int j = 0; j < timelogs[i].length; j++ ) {
                if( (startday - 1 + j) % 7 > 4 ) {
                    continue;
                }
                
                if( timelogs[i][j] > hour * 100 + minute ) {
                    answer--;
                    break;
                }
            }
        }
        
        return answer;
    }
}