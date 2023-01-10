package StringKMP;

import java.util.Scanner;

// 입력 : Knuth-Morris-Pratt
// 출력 : KMP
// 입력 : Mirko-Slavko
// 출력 : MS
// 첫번째 방법 : split() 메소드 이용
// 두번째 방법 : charAt() 메소드를 이용해 대문자만 추출하는 방법
//        Scanner sc = new Scanner(System.in);
//        System.out.print("문자를 입력하세요 : ");
//        String str = sc.next();
//        char ch;
//        for(int i = 0; i < str.length(); i++) {
//        ch = str.charAt(i);
//        if(ch >= 'A' && ch <= 'Z') System.out.print(ch);
// 세번째 방법 :  0번째 문자를 출력하고, '-'이 후 문자를 출력하는 방법
// 네번째 방법 : 문자 배열로 변경 후 출력 하기
public class StringKMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String name = sc.next();
        // 첫번째 방법 : split() 메소드 이용
        String[] splitName = name.split("-"); // "-" 기준으로 문자열을 작은 문자열로 만듬
        for (String e : splitName) { // 향상된 for 문으로 문자열 배열을 순회함
            System.out.print(e.charAt(0));  // 해당 문자열의 0번 인덱스의 문자를 추출
        }

        // 두번째 방법 : charAt() 메소드를 이용해 대문자만 추출하는 방법
//        for (int i = 0; i < name.length(); i++)
//            if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
//                System.out.print(name.charAt(i));

        // 세번째 방법 :  0번째 문자를 출력하고, '-'이 후 문자를 출력하는 방법
        for(int i = 0; i < name.length(); i++) {
            if(i == 0) System.out.print(name.charAt(i));
            else {
                if(name.charAt(i) == '-') System.out.print(name.charAt(i));
            }
        }

        // 네번째 방법 : 문자 배열로 변경 후 출력 하기
        // "Knuth-Morris-Pratt" => 'k', 'n', 'u', 't', '-'
        char[] chName = name.toCharArray();
        for(char e : chName) {
            if(e >= 'A' && e <='Z') System.out.print(e);
        }

             }
}

