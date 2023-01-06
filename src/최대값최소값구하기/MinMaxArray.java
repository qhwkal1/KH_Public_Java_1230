package 최대값최소값구하기;
import java.util.Scanner;

// 정수를 입력 받음 (배열의 갯수)
// 입력 받은 정수의 크기 만큼의 배열 생성
// 배열의 크기 만큼 순회하면서 임의의 정수 값 입력
// 입력 받은 배열에서 최소값과 최대값 출력
// 정수값 : 10
// 1 3 5 13 16 34 9 11 10 8
// MIN : 1
// MAX : 34
public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            // 스캐너 생성
        System.out.print("배열의 크기 입력 : ");
        int number = sc.nextInt();                      // 정수값 입력 받기
        int[] arr = new int[number];                    // 입력 받은 정수값으로 배열 생성
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();            //생성된 배열의 크기만큼 순회하면서 임의의 정수 입력 받음
        }
        int min = arr[0];
        int max = arr[0];           // 최소값과 최대값을 구하기 위해 배열의 첫번째값 대임
//        for (int e : arr) {
//            if(min > e) min = e;
//            if(max < e) max = e;  // 반복문을 순회하면서 최소값과 최대값 찾기
//        }
        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i]) min = arr[i];
            if(max < arr[i]) max = arr[i];
        }
        System.out.println("최소값 : " + min);
        System.out.println("최대값 : " + max);  // 결과 출력
    }
}
