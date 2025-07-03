// https://school.programmers.co.kr/learn/courses/30/lessons/42577?language=java

/*
시간초과 발생
전화번호끼리 비교하는 부분에서 시간이 많이 발생하는 것으로 보입니다.
비교할 대상을 해시로 저장해두는 방식으로 변경 필요

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book, new Comparator<String>() {
            public int compare(String a, String b) {
                return a.length() - b.length();
            }
        });

        for( int i = 0; i < phone_book.length - 1; i++ ) {
            for( int j = i + 1; j < phone_book.length; j++ ) {
                int len = phone_book[i].length();
                if( phone_book[j].substring(0, len).equals(phone_book[i]) ) {
                    answer = false;
                    break;
                }
            }
        }

        return answer;
    }
}
*/

import java.util.Set;
import java.util.HashSet;

class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();
        for( String phone : phone_book ) {
            set.add(phone);
        }

        for( String phone : phone_book ) {
            for( int i = 1; i < phone.length(); i++ ) {
                if( set.contains(phone.substring(0, i)) ) {
                    return false;
                }
            }
        }

        return true;
    }
}