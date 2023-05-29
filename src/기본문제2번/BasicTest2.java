package 기본문제2번;
// - 양의 정수 n을 입력받아 n * n 크기의 행렬을 출력하는 프로그램 작성.
// - 이 때 행렬의 값은 1부터 시작하여 왼쪽에서 오른쪽, 위에서 아래 순서대로 채워 넣음.

import java.util.Scanner;

public class BasicTest2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i = 1; i <= n * n; i++) {
//            System.out.printf("%4d", i);
//            if(i % n == 0) System.out.println();
//        }
    // 1 ~ 1000 사이의 7의 배수를 구하고 한줄에 10개 항목씩 출력
//public static void main(String[] args) {
//    int cnt = 0;
//    for(int i = 1; i <= 1000; i++) {
//        if(i % 7 == 0) {
//            System.out.printf("%5d", i);
//            if(i % 70 == 0) System.out.println();
//        }
//    }
//}
    // n 개의 정수를 입력 받아 최소값과 최대값 구하기
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] m = new int[n];
    for(int i = 0; i < m.length; i++) {
        System.out.println("최대값 : " + Math.max(n, n));
        System.out.println("최소값 : " + Math.min(n, n));
    }
}
}

