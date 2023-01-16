package 평균은넘겠지;
// 문제
// 대학생 새내기들의 90%는 자신이 반에서 평균을 넘는다고 생각한다.
// 5 => 총 테스트 케이스
// 5 50 50 70 80 100 => 각 테스트에 대한 학생 수, 그리고 각 학생의 점수
// 7 100 95 90 60 70 60 50
// 3 70 90 80
// 3 70 90 81
// 9 100 99 98 97 96 95 94 93 92 91

import java.util.Scanner;

// 40.000%
// 57.143%
// 33.333%
// 66.667%
// 55.556%
public class AboveAver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int average;
        int tc = sc.nextInt();

    }
}
class  TestCase {
    Scanner sc = new Scanner(System.in);
    int sum = sc.nextInt();
    int a;
    TestCase() {
        for(a = 0; a < sc.nextInt(); a++) {
            if(sum / a >= 50) System.out.print("평균값은 : " + a);
        }
    }


}