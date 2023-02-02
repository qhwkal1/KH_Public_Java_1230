package 예외처리예제5번;

import java.io.IOException;

// 예외처리 미루기 : 해당 메소드안에서 예외처리 대한 부분을 메소드를 호출한 상태로 넘어가는거
public class ExceptionEx5 {
    public static void main(String[] args) {
        IoSample ioSample = new IoSample();
        try {
            ioSample.input();
            ioSample.output();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class IoSample {
    private int num;
    public void input() throws IOException {
        num = System.in.read();
    }
    public void output() {
        System.out.println(num);
    }
}
