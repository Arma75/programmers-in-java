// https://school.programmers.co.kr/learn/courses/30/lessons/120894?language=java
class Solution {
    public long solution(String numbers) {
        String[] alphabet = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for( int i = 0; i < 10; i++ ) {
            numbers = numbers.replaceAll(alphabet[i], i + "");
        }
        return Long.parseLong(numbers);
    }
}