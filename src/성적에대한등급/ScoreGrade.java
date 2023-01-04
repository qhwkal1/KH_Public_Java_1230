package 성적에대한등급;

import java.util.Scanner;

// 성적을 입력 받음
// 입력 받은 성적이 0 ~ 100 사이가 아니면 "성적을 잘못 입력 하였습니다" 라고 출력
// 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60이상이면 D, 나머지는 F로 출력
public class ScoreGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요 : ");
        int grade = sc.nextInt();

        if(grade < 0 || grade > 100) {
            System.out.println("성적을 잘못 입력 하였습니다.");
            return;
        }

        if(grade >= 0 && grade <=100) {
            if (grade >= 90) {
                System.out.println(grade + "점은 A 입니다.");
            } else if (grade >= 80) {
                System.out.println(grade + "점은 B 입니다.");
            } else if (grade >= 70) {
                System.out.println(grade + "점은 C 입니다.");
            } else if (grade >=60) {
                System.out.println(grade + "점은 D 입니다.");
            } else System.out.println(grade + "점은 F 입니다.");

        }
    }
}
