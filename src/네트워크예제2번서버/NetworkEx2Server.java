package 네트워크예제2번서버;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
public class NetworkEx2Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(); // 포트 바인딩을 위해서 serverSocket 생성
            // bind 시 IP와 port 번호를 입력하는데 대부분의 경우 IP는 localhost 로 지정하고, 멀티 IP 인 경우에는 정확한 IP를 지정
            serverSocket.bind(new InetSocketAddress("localhost",5001));
            while (true) {
                System.out.println("[연결 기다림]");
                Socket socket = serverSocket.accept(); // 클라이언트 연결 요청을 수락 함(연결 요쳥이 있기 전까지 블로킹 상태)
                InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                System.out.println("[연결 요청을 수락 함] " + isa.getHostName()); // 클라이언트 IP를 반환
            }
        } catch (Exception e) {}

        if(!serverSocket.isClosed()) {
            try {
                serverSocket.close();
            } catch (IOException e) {}
        }
    }
}
