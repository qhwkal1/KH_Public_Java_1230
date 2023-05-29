package 연습문제5;

import java.util.Scanner;

// 입력 받은 수가 소수인지 아닌지 판별하기
// 소수란 1과 자기자신의 이외에는 나누어지지 않는 수
public class BasicTest05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("판별할 수 입력 : ");
        int num = sc.nextInt();
        if(isPrime(num)) System.out.println(num + " 는 소수입니다.");
        else System.out.println(num + " 은 소수가 아닙니다.");
    }
    static boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if(n / i == 0) return false;
        }
        return true;
    }
}
