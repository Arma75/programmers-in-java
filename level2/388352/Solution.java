// https://school.programmers.co.kr/learn/courses/30/lessons/388352
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public List<int[]> secretCodeList = new ArrayList<>();
    
    public void generateSecretCodeList(int start, int max, int[] code, int count) {
        if( count == 5 ) {
            secretCodeList.add(Arrays.copyOf(code, 5));
            return;
        }
        
        for( int i = start; i <= max; i++ ) {
            code[count] = i;
            generateSecretCodeList(i + 1, max, code, count + 1);
        }
    }
    
    public int solution(int n, int[][] q, int[] ans) {
        int answer = 0;
        
        int[] code = new int[5];
        generateSecretCodeList(1, n, code, 0);
        
        for( int[] secretCode : secretCodeList ) {
            boolean isRight = true;
            for( int i = 0; i < q.length; i++ ) {
                int right = 0;
                for( int j = 0; j < 5; j++ ) {
                    for( int k = 0; k < 5; k++ ) {
                        if( secretCode[k] == q[i][j] ) {
                            right++;
                            break;
                        }
                    }
                }
                
                if( right != ans[i] ) {
                    isRight = false;
                    break;
                }
            }
            
            if( isRight ) {
                answer++;
            }
        }
        
        return answer;
    }
}