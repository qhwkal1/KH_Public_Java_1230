package 자리수구분;
import java.util.Scanner;
// 1564

public class PraticeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 - ");
        int a, b, c, d;
        int number = sc.nextInt();
        a = number / 1000;
        b = (number % 1000) / 100;
        c = ((number % 1000 ) % 100) / 10;
        d = number % 10;
        System.out.println("1000의 자리 : " + a + ", 100의 자리 : " + b + ", 10의 자리 : " + c + ", 1의 자리 : " + d);
    }
}
