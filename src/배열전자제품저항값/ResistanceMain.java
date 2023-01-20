package 배열전자제품저항값;

import java.util.Scanner;
// 3개의 컬러를 입력 받음 (문자열로 입력)
// 첫번째 컬러 : 10의자리수
// 두번째 컬러 : 1의 자리수
// 세번째 컬러 : 곱을 의미
// black, brown, red, orange, yellow, green, blue, violet, gray, white
// 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000
public class ResistanceMain {
    public static void main(String[] args) {
        // 컬러값에 대한 문자열 배열 선언
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue"
        , "violet", "grey", "white"};
        int fst = 0, sec = 0, thd = 0;
        Scanner sc = new Scanner(System.in);
        String fstColor = sc.next();
        String secColor = sc.next();
        String thdColor = sc.next();
        for(int i = 0; i < color.length; i++) {
            if(fstColor.equals(color[i])) fst = i;
            if(secColor.equals(color[i])) sec = i;
            if(thdColor.equals(color[i])) thd = i;
        }
        System.out.println((long)((fst * 10) + sec) * (long)(Math.pow(10, thd)));


    }
}
