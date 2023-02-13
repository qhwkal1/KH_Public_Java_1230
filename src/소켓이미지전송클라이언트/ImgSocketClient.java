package 소켓이미지전송클라이언트;
import java.net.Socket;
import java.util.Scanner;

// 서버에서 파일이 전송되었습니다. 저장할 경로를 지정 하세요.
// 해당 경로로 파일 저장
public class ImgSocketClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Socket socket = new Socket("localhost",8999);
            System.out.println("서버 접속 성공");
            System.out.print("저장할 위치를 지정 하세요(경로/파일명) : ");
            String path = sc.nextLine();


        } catch (Exception e) {}
    }
}


