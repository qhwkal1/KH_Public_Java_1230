package 연습문제4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 10개의 배열에서 중복된 숫자 입력 후 2번째 숫자 찾기(1,2,3,4,5,1,2,3,4,5)
// 찾는 두번째 수가 없는 경우 -1
// 임의의 수 10개 입력 하기
// 찾을 숫자 :
// 결과 :
public class BasicTest04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt = 0;
        System.out.println("임의의 수 10개 압력 : ");
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("찾을 수 : ");
        int findNum = sc.nextInt();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == findNum) {
                cnt++;
                if(cnt == 2) {
                    System.out.println(i+1); break;
                }
            }
        }
        if(cnt < 2)
        System.out.println("-1");
    }
}
