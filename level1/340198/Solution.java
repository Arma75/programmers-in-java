// https://school.programmers.co.kr/learn/courses/30/lessons/340198
import java.util.Arrays;

class Solution {
    public boolean isPositionable(String[][] park, int sy, int sx, int size) {
        if( park.length < sy + size ) {
            return false;
        } else if( park[0].length < sx + size ) {
            return false;
        }
        
        boolean bPositionable = true;
        for( int i = sy; i < sy + size; i++ ) {
            for( int j = sx; j < sx + size; j++ ) {
                if( !park[i][j].equals("-1") ) {
                    bPositionable = false;
                    break;
                }
            }
        }
        
        return bPositionable;
    }
    
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        
        Arrays.sort(mats);
        for( int i = 0; i < mats.length / 2; i++ ) {
            int temp = mats[i];
            mats[i] = mats[mats.length - 1 - i];
            mats[mats.length - 1 - i] = temp;
        }
        
        for( int i = 0; i < park.length; i++ ) {
            for( int j = 0; j < park[0].length; j++ ) {
                if( !park[i][j].equals("-1") ) {
                    continue;
                }
                
                for( int k = 0; k < mats.length; k++ ) {
                    if( isPositionable(park, i, j, mats[k]) ) {
                        if( answer < mats[k] ) {
                            answer = mats[k];
                        }
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}