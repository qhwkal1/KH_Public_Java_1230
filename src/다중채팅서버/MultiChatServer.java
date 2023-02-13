package 다중채팅서버;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

class MultiChatServer {
    public static void main(String[] args) {
        // 서버 : 192.168.10.245
        int port = 8900;
        try {
            // port 번호만 넣으면 서버의 첫번째 ip가 자동 입력
            // 바인딩 과정 생략
            ServerSocket serverSocket = new ServerSocket(port);
            while(true) {
                // 하나의 session, 즉 한개의 연결 통로가 만들어 짐
                Socket socket = serverSocket.accept();
                Thread serverTh = new ServerSocketTh(socket);
                serverTh.start();
            }

        } catch(IOException e) {}
    }
}

class ServerSocketTh extends Thread {
    // 소켓 식별자로 어레이리스트 생성
    Socket socket;
    static List<Socket> sockets = new ArrayList<>();
    public ServerSocketTh(Socket socket) {
        this.socket = socket;
        sockets.add(socket);
    }
    @Override
    public void run() {
        try {
            while(true) {
                String str;
                // 소켓으로 부터 입력을 받음 (바이트 단위)
                InputStream input = socket.getInputStream();
                // 문자 변환 보조 스트림 (바이트 입력을 문자로 변환)
                InputStreamReader isr = new InputStreamReader(input);
                // 버퍼를 이용이용하면 입/출력 성능이 개선 됨 (성능향상보조스트림)
                BufferedReader reader = new BufferedReader(isr);
                if((str = reader.readLine()) != null) {
                    System.out.println(str);
                    for(int i = 0; i < sockets.size(); i++) {
                        OutputStream out = sockets.get(i).getOutputStream(); // 쓰기
                        // 텍스트 출력 스트림
                        PrintWriter writer = new PrintWriter(out, true);
                        writer.println(str);
                    }
                }
            }
        } catch (IOException e) {}
    }
}