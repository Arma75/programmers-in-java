// https://school.programmers.co.kr/learn/courses/30/lessons/42895?language=java
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> calculateResult(Set<Integer> srcSet, Set<Integer> dstSet) {
        List<Integer> list = new ArrayList<>();
        for( Integer n : srcSet ) {
            for( Integer m : dstSet ) {
                list.add(n + m);
                list.add(n - m);
                list.add(n * m);
                if( m > 0 ) {
                    list.add(n / m);   
                }
            }
        }
        
        return list;
    }
    
    public int solution(int N, int number) {
        Set<Integer>[] sets = new HashSet[9];
        for( int i = 0; i < 9; i++ ) {
            sets[i] = new HashSet<>();
        }
        
        for( int i = 1; i < 9; i++ ) {
            sets[i].add(Integer.parseInt((N + "").repeat(i)));
            
            for( int j = 1; j < i; j++ ) {
                List<Integer> list = calculateResult(sets[j], sets[i - j]);
                for( Integer n : list ) {
                    sets[i].add(n);
                }
            }
        }
        
        for( int i = 1; i < 9; i++ ) {
            if( sets[i].contains(number) ) {
                return i;
            }            
        }
        
        return -1;
    }
}