// https://school.programmers.co.kr/learn/courses/30/lessons/1835
import java.util.List;
import java.util.ArrayList;

class Solution {
    String[] friends = {"A", "C", "F", "J", "M", "N", "R", "T"};
    List<String> layouts = new ArrayList<>();
    
    public void dfs(String layout, int count, boolean[] visit) {
        if( count == 8 ) {
            layouts.add(layout);
            return;
        }
        
        for( int i = 0; i < 8; i++ ) {
            if( visit[i] ) {
                continue;
            }
            
            visit[i] = true;
            dfs(layout + friends[i], count + 1, visit);
            visit[i] = false;
        }
    }
    
    public boolean isAvailable(String layout, String[] queries) {
        for( String query : queries ) {
            String[] queryArray = query.split("");
            int sourceIndex = layout.indexOf(queryArray[0]);
            int targetIndex = layout.indexOf(queryArray[2]);
            int currentGap = Math.abs(sourceIndex - targetIndex) - 1;
            int targetGap = Integer.parseInt(queryArray[4]);
            String type = queryArray[3];
            
            if( type.equals("=") && currentGap != targetGap ) {
                return false;
            } else if( type.equals(">") && currentGap <= targetGap ) {
                return false;
            } else if( type.equals("<") && currentGap >= targetGap ) {
                return false;
            }
        }
        
        return true;
    }
    
    public int solution(int n, String[] data) {
        dfs("", 0, new boolean[8]);
        
        int answer = 0;
        for( String layout : layouts ) {
            if( isAvailable(layout, data) ) {
                answer++;
            }
        }
        
        return answer;
    }
}