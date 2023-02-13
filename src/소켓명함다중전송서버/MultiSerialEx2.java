package 소켓명함다중전송서버;
import 명함전송서버.NameCard;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiSerialEx2 {
    static List<NameCard> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        int port = 0401;
        ServerSocket serverSocket = new ServerSocket(port);
        Scanner sc = new Scanner(System.in);
        while(true) {
            Socket socket = serverSocket.accept(); // 클라이언트 연결 요청에 대한 대기
            System.out.println("[클라이언트 : " + socket.getRemoteSocketAddress() + "] 연결");
            System.out.println("클라이언트로 명함을 전송 하시겠습니까?(yes / no) : ");
            String confirm = sc.next();
            if (confirm.equalsIgnoreCase("yes")) {
                Thread nameTh = new NameServerTh(socket);
                nameTh.start();
            }
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

class NameServerTh extends Thread {
    static ArrayList<Socket> sockets = new ArrayList<>();
    Socket socket;
    public NameServerTh(Socket socket) {
        this.socket = socket;
        sockets.add(socket);
    }
    @Override
    public void run() {
        try {
            for(int i = 0; i < sockets.size(); i++) {
                OutputStream os = sockets.get(i).getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(os);
                oos.writeObject(MultiSerialEx2.writeNameCard()); // 직렬화를 위해 객체를 write
                oos.flush();
                oos.close();
                System.out.println(sockets.get(i).getRemoteSocketAddress().toString() + "에게 전송 완료");
                os.flush();
            }
        } catch (IOException e) {}
    }

}