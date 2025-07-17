// https://school.programmers.co.kr/learn/courses/30/lessons/258712?language=java
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        
        int size = friends.length;
        Map<String, Integer> map = new HashMap<>();
        for( int i = 0; i < size; i++ ) {
            map.put(friends[i], i);
        }
        
        int[][] trade = new int[size][size];
        int[] totalTrade = new int[size];
        for( String gift : gifts ) {
            String[] arr = gift.split(" ");
            trade[map.get(arr[0])][map.get(arr[1])]++;
            totalTrade[map.get(arr[0])]++;
            totalTrade[map.get(arr[1])]--;
        }
        
        int[] nextTakeGift = new int[size];
        for( int i = 0; i < size; i++ ) {
            for( int j = 0; j < size; j++ ) {
                if( j == i ) {
                    continue;
                }
                
                if( trade[i][j] > trade[j][i] ) {
                    nextTakeGift[i]++;
                } else if( trade[i][j] == trade[j][i] && totalTrade[i] > totalTrade[j] ) {
                    nextTakeGift[i]++;
                }
            }
        }
        
        for( int i = 0; i < size; i++ ) {
            if( answer < nextTakeGift[i] ) {
                answer = nextTakeGift[i];
            }
        }
        
        return answer;
    }
}