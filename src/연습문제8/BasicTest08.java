package 연습문제8;

import java.util.Scanner;

// 정수 N개로 이루어진 배열 A와 정수 X가 주어진다. 이떄, A에서 X보다 작은수를 모두 출력하는 프로그램을 작성하시오.
// 첫째 줄에 N과 X가 주어진다. (1 <= N, X <= 10,000)
// 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다
// 10 5
// 1 10 4 9 2 3 8 5 7 6
// 출력 : 1 4 2 3
public class BasicTest08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] < x) System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
