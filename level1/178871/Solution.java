// https://school.programmers.co.kr/learn/courses/30/lessons/178871?language=java
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        for( int i = 0; i < players.length; i++ ) {
            map1.put(players[i], i);
            map2.put(i, players[i]);
        }
        
        for( String player1 : callings ) {
            int rank1 = map1.get(player1);
            String player2 = map2.get(rank1 - 1);
            int rank2 = map1.get(player2);
            
            map1.put(player1, rank2);
            map1.put(player2, rank1);
            map2.put(rank2, player1);
            map2.put(rank1, player2);
        }
        
        List<String> keySet = new ArrayList<>(map1.keySet());
        keySet.sort((p1, p2) -> map1.get(p1) - map1.get(p2));
        
        return keySet.stream().toArray(String[]::new);
    }
}