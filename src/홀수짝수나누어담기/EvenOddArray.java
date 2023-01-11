package 홀수짝수나누어담기;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EvenOddArray {
    List<Integer> inList = new ArrayList<>();
    List<Integer> oddList = new ArrayList<>();
    List<Integer> evenList = new ArrayList<>();
    void inputValue() {
       Scanner sc = new Scanner(System.in);
       System.out.print("정수 입력 : ");
       int value = 0;
       while (true) {
           value = sc.nextInt();
           if(value == 999) break;
           inList.add(value);
       }
    }
    void separateValue() {
        for(int e : inList) {
            if(e % 2 == 0) evenList.add(e);
            else oddList.add(e);
        }
    }
    void displayValue() {
        System.out.print("홀수 : ");
        for(int e : oddList) System.out.print(e + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for(int e : evenList) System.out.print(e + " ");
    }
}
/*
    int[] inputArray = new int[7];
    int[] oddArray = new int[7];
    int[] evenArray = new int[7];
    int evenIdx = 0; // 짝수에 대한 인덱스 계산
    int oddIdx = 0; // 홀수에 대한 인덱스 계산
    void inputValue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = sc.nextInt();
        }
    }
    void separateValue() {
        for (int e : inputArray) {
            if (e % 2 == 0) evenArray[evenIdx++] = e;
            else oddArray[oddIdx++] = e;
        }
    }
    void displayValue() {
        System.out.print("홀수 : ");
        for (int i = 0; i < oddIdx; i++) {
            System.out.print(oddArray[i] + " ");
        }
        System.out.println();
        System.out.print("짝수 : ");
        for (int i = 0; i < evenIdx; i++) {
            System.out.print(evenArray[i] + " ");
        }
    }
}
*/