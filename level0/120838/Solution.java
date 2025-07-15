// https://school.programmers.co.kr/learn/courses/30/lessons/120838?language=java
import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        String answer = "";
        
        Map<String, String> morseCodeMap = new HashMap<>();
        morseCodeMap.put(".-", "a");
        morseCodeMap.put("-...", "b");
        morseCodeMap.put("-.-.", "c");
        morseCodeMap.put("-..", "d");
        morseCodeMap.put(".", "e");
        morseCodeMap.put("..-.", "f");
        morseCodeMap.put("--.", "g");
        morseCodeMap.put("....", "h");
        morseCodeMap.put("..", "i");
        morseCodeMap.put(".---", "j");
        morseCodeMap.put("-.-", "k");
        morseCodeMap.put(".-..", "l");
        morseCodeMap.put("--", "m");
        morseCodeMap.put("-.", "n");
        morseCodeMap.put("---", "o");
        morseCodeMap.put(".--.", "p");
        morseCodeMap.put("--.-", "q");
        morseCodeMap.put(".-.", "r");
        morseCodeMap.put("...", "s");
        morseCodeMap.put("-", "t");
        morseCodeMap.put("..-", "u");
        morseCodeMap.put("...-", "v");
        morseCodeMap.put(".--", "w");
        morseCodeMap.put("-..-", "x");
        morseCodeMap.put("-.--", "y");
        morseCodeMap.put("--..", "z");
        
        for( String morseCode : letter.split(" ") ) {
            answer += morseCodeMap.get(morseCode);
        }
        
        return answer;
    }
}