// https://school.programmers.co.kr/learn/courses/30/lessons/120956?language=java
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] words = new String[]{"aya", "ye", "woo", "ma"};
        for( int i = 0; i < babbling.length; i++ ) {
            for( int j = 0; j < 4; j++ ) {
                for( String word : words ) {
                    if( !babbling[i].startsWith(word) ) {
                        continue;
                    }

                    babbling[i] = babbling[i].substring(word.length());
                }
            }
        }
        
        for( String babble : babbling ) {
            if( babble.length() == 0 ) {
                answer++;
            }
        }
        
        return answer;
    }
}