package 알고리즘_알람;

import java.util.Scanner;

//매일 알람을 듣고 일어난다. 알람을 듣고 바로 일어나면 다행이겠지만, 항상 조금만 더 자려는 마음 때문에 매일 학교를 지각하고 있다.
//이 친구는 모든 방법을 동원해보았지만 조금만 더 자려는 마음은 그 어떤것오 없앨 수가 없었다
//이런 친구를 불쌍하게 보던 다른친구는 자신이 사용하는 방법을 추천해 주었다
//바로 45분 일찍 알람 설정하기 이다.

public class AlarmTest {
    public static void main(String[] args) {
        int hour , min, calc;
        Scanner sc = new Scanner(System.in);
        System.out.println("시간 입력 : ");
        hour = sc.nextInt();
        min = sc.nextInt();
        calc = (hour * 60) + min;
        if(calc < 45) {
            calc = (24 * 60) + min;
        }
        calc -= 45;
        System.out.printf("%d %d\n", (calc / 60), (calc % 60));
    }
}
