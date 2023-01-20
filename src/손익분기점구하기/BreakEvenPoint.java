package 손익분기점구하기;
import java.util.Scanner;
// 손익분기점이란 ? 총 수입이 총 비용보다 많아져서 이익이 발생하는 지점을 의미
// A(고정비용), B(가변비용), C(판매가격)
// 이익이 나는 지점의 생산 댓수 출력하기
// 손익 분기점이 존재하지 않으면 -1 출력
public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if(C <= B) {
            System.out.println("-1");
        } else  {
            System.out.println((A/(C-B)) + 1);
        }
    }
}
