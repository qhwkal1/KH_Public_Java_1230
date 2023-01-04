package 알람설정하기;
import java.util.Scanner;

// 상근이라는 친구가 있는데, 이친구는 매일 학교를 지각을 합니다.
// 창영이라는 친구가 상근이에게 지각하지 않는 방법을 알려 줍니다.
// 알람을 설정하면 자동으로 설정 시간보다 45분 일찍 설정되도록 함.
// 입력 시간과 분으로 입력 받기
// 시간은 24시간제
// 입력 받은 시간에서 45분 이전에 알람을 울리도록 설정 (5시 30분) -> 4시 45분
public class AlamSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간을 입력하세요 : ");
        int hour = sc.nextInt();
        System.out.print("분 입력 : ");
        int min = sc.nextInt();
        int calc = (hour * 60) + min;
        if(calc < 45) {
            calc = (24 * 60) + min;
        }
        calc -= 45;
        System.out.printf("%d시%d분\n", (calc/60), (calc % 60));
    }
}
