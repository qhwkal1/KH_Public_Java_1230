package 인터페이스복습1;
// 인터페이스란 ? : 자바에서 다중 상속을 지원하기 위해서 만들어진 기능
// 모든 필드는 상수로 변경됩니다 (final static)
// 모든 메소드는 추상 메소드로 변경된 (public abstract 추가)
// 예외적으로 디폴트 메소드는 구현부가 있으며 상속 받은 클래스에서 재정의 하여 사용 가능
// 인터페이스 상속의 문제점을 해결하기 위한 예외조항

import java.util.Scanner;

public class InterfaceEx02 {
    public static void main(String[] args) {
        CocoaTalk cocoaTalk = new CocoaTalk("해석님");
        NetAdapter netAdapter;
        cocoaTalk.writeMsg("벌써 여름이 왔어요");
        Scanner sc = new Scanner(System.in);
        System.out.println("네트워크 [1]WIFI [2]5G : ");
        int num = sc.nextInt();

        if(num == 1) netAdapter = new WiFi();
        else netAdapter = new FiveG();
        cocoaTalk.send(netAdapter);

    }
}
