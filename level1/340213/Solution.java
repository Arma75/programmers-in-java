// https://school.programmers.co.kr/learn/courses/30/lessons/340213
class Solution {
    public int toSecond(String mmss) {
        String[] time = mmss.split(":");
        
        return Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
    }
    
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoSec = toSecond(video_len);
        int posSec = toSecond(pos);
        int opStartSec = toSecond(op_start);
        int opEndSec = toSecond(op_end);
        
        for( String command : commands ) {
            if( opStartSec <= posSec && posSec <= opEndSec ) {
                posSec = opEndSec;
            }
            
            if( command.equals("prev") ) {
                posSec = Math.max(0, posSec - 10);
            } else if( command.equals("next") ) {
                posSec = Math.min(videoSec, posSec + 10);
            }
        }
        
        if( opStartSec <= posSec && posSec <= opEndSec ) {
            posSec = opEndSec;
        }
        
        int m = posSec / 60;
        int s = posSec % 60;
        
        return (m < 10? "0" + m : m) + ":" + (s < 10? "0" + s : s);
    }
}