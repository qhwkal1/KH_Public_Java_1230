package 예외처리예제2번;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
// FileNotFoundException
// NullPointException : 내가 참조하고 있는 객체가 없는 경우
public class ExceptionEx2 {
    public static void main(String[] args) {
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("../database.properties"));
//            br.readLine();
//            br.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("파일을 발견 할 수 없습니다.");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("프로그램 종료");
       // Test test = new Test();
        Test test = null; // 참조변수가 참조하는 객체가 없음을 의미 함
        String str = test.name;
        System.out.println(str);

    }
}

class Test {
    String name = "테스트";

}