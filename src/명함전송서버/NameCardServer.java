package 명함전송서버;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 1. 명함 정보를 담을 클래스 생성 (이름, 전화번호, 이메일, 소속)
// 2. List 생성 후 10명에 대한 명함 정보 입력
// 3. 서버는 accept() 에서 클라이언트 연결을 기다리다가 연결 요청이 오면 연결을 수락하고
// 명함 전송 여부를 물어본 (전송 하시겠습니까? (Yes / NO) )
// 4. 클라이언트에서 명함을 수신하면 출력하기
public class NameCardServer {
    static List<NameCard> list = new ArrayList<>();
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int port = 0401;
        ServerSocket serverSocket = new ServerSocket(port);
        Scanner sc = new Scanner(System.in);
        while(true) {
            Socket socket = serverSocket.accept(); // 클라이언트 연결 요청에 대한 대기
            System.out.println("[클라이언트 : " + socket.getRemoteSocketAddress() + "] 연결");
            System.out.println("클라이언트로 명함을 전송 하시겠습니까?(yes / no) : ");
            String confirm = sc.next();
            if(confirm.equalsIgnoreCase("yes")) {
                OutputStream os = socket.getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(os);
                oos.writeObject(writeNameCard());
                oos.flush();
                oos.close();
                os.close();

            } else System.out.println("전송을 종료합니다."); break;
        }
    }
    static List<NameCard> writeNameCard() {

        list.add(new NameCard("김정민","010-9737-8791","qhwkal1@naver.com","단풍"));
        list.add(new NameCard("노영준","010-5117-6942","nyj1@naver.com","단풍"));
        list.add(new NameCard("김희원","010-4152-1988","khj@naver.com","단풍"));
        list.add(new NameCard("김민아","010-1511-1124","kma@naver.com","단풍"));
        list.add(new NameCard("박용빈","010-2241-1115","pyb@naver.com","단풍"));
        list.add(new NameCard("이혜민","010-4137-1221","Lhm@naver.com","단풍"));
        list.add(new NameCard("임세은","010-1117-3381","ise1@naver.com","단풍"));
        list.add(new NameCard("박기태","010-4447-1111","pkt@naver.com","단풍"));
        list.add(new NameCard("이제은","010-1137-6661","lje@naver.com","단풍"));
        list.add(new NameCard("신채은","010-6603-8331","sce@naver.com","단풍"));
        return list;
    }
}
