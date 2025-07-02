// https://school.programmers.co.kr/learn/courses/30/lessons/42578?language=java

/*
시간초과 발생
의상 조합 전체를 알 필요 없으니 단순히 종류별 의상 개수만 알아내서 곱하는게 빠를 듯 함

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int wearCount = 0;

    public void wear(Map<String, ArrayList<String>> map, List<String> categories, int step) {
        if( step >= map.size() ) {
            wearCount++;
            return;
        }

        String category = categories.get(step);
        ArrayList<String> list = map.get(category);
        for( int i = 0; i < list.size(); i++ ) {
            wear(map, categories, step + 1);
        }
    }

    public int solution(String[][] clothes) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        List<String> categories = new ArrayList<>();
        for( String[] cloth : clothes ) {
            String name = cloth[0];
            String category = cloth[1];

            if( !map.containsKey(category) ) {
                map.put(category, new ArrayList<>());
                map.get(category).add("");

                categories.add(category);
            }

            map.get(category).add(name);
        }

        this.wear(map, categories, 0);

        return wearCount - 1;
    }
}
*/

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();
        for( String[] cloth : clothes ) {
            String name = cloth[0];
            String category = cloth[1];

            if( !map.containsKey(category) ) {
                map.put(category, 1);
            }

            map.put(category, map.get(category) + 1);
        }

        for( String category : map.keySet() ) {
            answer *= map.get(category);
        }

        return answer - 1;
    }
}