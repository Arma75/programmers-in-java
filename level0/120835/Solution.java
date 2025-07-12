// https://school.programmers.co.kr/learn/courses/30/lessons/120835?language=java
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = emergency.clone();
        
        for( int i = 0; i < emergency.length - 1; i++ ) {
            for( int j = i + 1; j < emergency.length; j++ ) {
                if( emergency[i] > emergency[j] ) {
                    continue;
                }
                
                int temp = emergency[i];
                emergency[i] = emergency[j];
                emergency[j] = temp;
            }
        }
        
        for( int i = 0; i < answer.length; i++ ) {
            for( int j = 0; j < emergency.length; j++ ) {
                if( answer[i] == emergency[j] ) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }
        
        return answer;
    }
}