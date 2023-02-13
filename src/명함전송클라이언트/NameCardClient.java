package 명함전송클라이언트;
import 명함전송서버.NameCard;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.List;

public class NameCardClient {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket socket = new Socket("192.168.10.245",8990);
        System.out.println("서버 접속 성공");
        InputStream is = socket.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);
        List<NameCard> nameCards = (List<NameCard>) ois.readObject();
        viewNameCards(nameCards);
    }
    static void viewNameCards(List<NameCard> nameCards) {
        for(NameCard e : nameCards) {
            System.out.println("===== 명함 정보 출력 =====");
            System.out.println("이름 : " + e.getName());
            System.out.println("회사 : " + e.getCompany());
            System.out.println("전화 : " + e.getPhoneNum());
            System.out.println("메일 : " + e.getMail());
        }
    }
}
