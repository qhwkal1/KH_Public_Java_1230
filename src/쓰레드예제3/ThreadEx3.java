package 쓰레드예제3;
import java.awt.*;

// Sleep() : 실행중인 Thread 를 일정 시간동안 멈추고 싶을 때 사용합니다.
// 매개변수로 전달되는 시간은 mille Second 단위 입니다. (1/1000초)
// 전달된 시간이 경과되면 다시 실행 대기 상태로 돌아간다.
public class ThreadEx3 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0; i < 20; i++) {
            toolkit.beep();
            try {
                Thread.sleep(3000); // 3초
            } catch (InterruptedException e ) {

            }
        }
    }
}
