// https://school.programmers.co.kr/learn/courses/30/lessons/120863?language=java
class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" ");
        int[] numArr = new int[2];
        for( String n : arr ) {
            if( n.equals("+") ) {
                continue;
            }
            
            if( n.contains("x") ) {
                String s = n.substring(0, n.length() - 1);
                numArr[0] += Integer.parseInt(s.length() == 0? "1" : s);
            } else {
                numArr[1] += Integer.parseInt(n);
            }
        }
        
        if( numArr[0] > 0 && numArr[1] > 0 ) {
            return "" + (numArr[0] == 1? "" : numArr[0]) + "x + " + numArr[1];
        } else if( numArr[0] > 0 ) {
            return "" + (numArr[0] == 1? "" : numArr[0]) + "x";
        } else {
            return "" + numArr[1];
        }
    }
}