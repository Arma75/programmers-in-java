// https://school.programmers.co.kr/learn/courses/30/lessons/120823?language=java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for( int i = 1; i <= n; i++ ) {
            for( int j = 0; j < i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}