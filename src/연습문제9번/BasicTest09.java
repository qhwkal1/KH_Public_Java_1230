package 연습문제9번;

import java.util.Scanner;

// 입력 받은 정수보다 작은 소수의 합을 구하는 함수를 만드시오
// 12를 입력하면 2,3,5,7,11 ==> 28
public class BasicTest09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 2; i < n; i++) {
            sum += isPrimeFunction(i);
        }
        System.out.println("소수의 합 : " + sum);
    }
    static int isPrimeFunction(int n) {
        boolean isPrime = true; // 기본값을 소수로 설정
        for(int i = 2; i < n; i++) {
            if(n % i == 0) isPrime = false;
        }
        if(isPrime) return n;
        else return 0;
    }
}
