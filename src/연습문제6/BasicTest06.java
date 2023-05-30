package 연습문제6;
// 1번
// 영어 소문자와 대문자로 이루어진 단어를 입력받은뒤,
// 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램 작성

// 2번
// 3자리의 정수를 입력받아 가장 큰 수 출력

// 3번
// 사용자에 의해 2개의 문자열을 입력
// 처음부터 두개의 문자열을 비교하여 공통의 글자가 몇개인지 확인합니다.
// 공통 부분 문자열과 그 길이를 인쇄합니다.
// 부분 문자열이 없으면 "NO CS"로 인쇄하고 0을 길이로 인쇄합니다.

import java.util.Scanner;

// 4번
// 문자열 반전 : abcdef -> fedcba
public class BasicTest06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("영어 입력 : ");
        String word = sc.next();
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }

// 3자리의 정수를 입력받아 가장 큰 수 출력
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("숫자 입력 : ");
//        int number = sc.nextInt();
//
//        int num1 = number / 100;
//        int num2 = (number / 10) % 10;
//        int num3 = number % 10;
//        int max = Math.max(num1, Math.max(num2, num3));
//        System.out.println("제일 큰 수 : " + max);
//    }
// 3번
// 사용자에 의해 2개의 문자열을 입력
// 처음부터 두개의 문자열을 비교하여 공통의 글자가 몇개인지 확인합니다.
// 공통 부분 문자열과 그 길이를 인쇄합니다.
// 부분 문자열이 없으면 "NO CS"로 인쇄하고 0을 길이로 인쇄합니다.
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.print("첫번쨰 문자열 입력 : ");
//    String one = sc.next();
//    System.out.print("두번쨰 문자열 입력 : ");
//    String two = sc.next();
//    int cnt = 0;
//    for(int i = 0; i < one.length(); i++) {
//        if(one.charAt(i) == two.charAt(i)) {
//            System.out.print(one.charAt(i));
//            cnt++;
//        } else break;
//    }
//    System.out.println();
//    if(cnt !=0) System.out.println();
//    else System.out.println("NO CS");
//}
    }
}
