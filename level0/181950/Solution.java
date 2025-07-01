// https://school.programmers.co.kr/learn/courses/30/lessons/181950?language=java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        System.out.print(str.repeat(n));
    }
}