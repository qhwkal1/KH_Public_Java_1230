package 연습문제7;
import java.util.Scanner;



public class BasicTest07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] call = new int[20]; // 총 통화 횟수를 20회로 제한
        int yPay = 0, mPay = 0; // 총 요금에 대한 변수
        System.out.println("통화 횟수 입력 : ");
        int n = sc.nextInt(); // 총 통화시간을 입력 받음
        System.out.println("각 통화 시간 입력 : ");
        for(int i = 0; i < n; i++) {
            call[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            yPay += (call[i] / 30) * 10 + 10;

        }
    }
}
