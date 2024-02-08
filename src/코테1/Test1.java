package 코테1;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int[] call = new int[20];
        int yPay = 0, mPay = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("통화 횟수 입력 : ");
        int n = sc.nextInt();
        System.out.println("통화 시간 입력 : ");
        for(int i = 0; i < n; i++) {
            call[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            yPay += (call[i] / 30) * 10 + 10;
            mPay += (call[i] / 60) * 15 + 15;
        }
        if (yPay > mPay) {
            System.out.println("M " + mPay);
        } else if (yPay < mPay) {
            System.out.println("Y " + yPay);
        } else {
            System.out.println("Y M " + yPay);
        }
    }
}
