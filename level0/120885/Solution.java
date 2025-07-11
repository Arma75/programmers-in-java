// https://school.programmers.co.kr/learn/courses/30/lessons/120885?language=java
class Solution {
    public int toDecimal(String binary) {
        int dec = 0;
        int m = 1;
        char[] arr = binary.toCharArray();
        for( int i = arr.length - 1; i >= 0; i-- ) {
            dec += Integer.parseInt(arr[i] + "") * m;
            m *= 2;
        }
        
        return dec;
    }
    public String toBinary(int decimal) {
        String bin = "";
        while( decimal > 0 ) {
            bin = (decimal % 2) + bin;
            decimal /= 2;
        }
        
        return bin.length() == 0? "0" : bin;
    }
    
    public String solution(String bin1, String bin2) {
        return toBinary(toDecimal(bin1) + toDecimal(bin2));
    }
}