// https://school.programmers.co.kr/learn/courses/30/lessons/120907?language=java
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for( int i = 0; i < quiz.length; i++ ) {
            String[] arr = quiz[i].split(" ");
            int n1 = Integer.parseInt(arr[0]);
            int n2 = Integer.parseInt(arr[2]);
            int result = Integer.parseInt(arr[4]);
            
            if( arr[1].equals("-") ) {
                answer[i] = result == n1 - n2? "O" : "X";
            } else {
                answer[i] = result == n1 + n2? "O" : "X";
            }
        }
        
        return answer;
    }
}