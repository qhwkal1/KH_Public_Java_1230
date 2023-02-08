package 입출력스트림예제5번;
import java.io.*;

public class StreamEx5 {
    public static void main(String[] args) {
//        try {
//            InputStream is = new FileInputStream("src/입출력스트림예제5번/StreamEx5.java");
//            int data;
//            while ((data = is.read()) != -1) {
//                System.out.write(data); // write 메소드는 바이트를 출력하거나 아스키코드를 출력할때 쓰임
//            }
//            is.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        // FileOutputStream : 바이트 단위로 데이터를 파일에 저장 할 때 사용하는 바이트 기반 출력 스트림 입니다.
        // 바이트 단위로 저장하기 때문에 그림, 오디오, 텍스트 등 모든 종류의 데이터를 파일에 저장 할 수 있습니다.
        String originalFileName = "src/입출력스트림예제5번";
        String targetFileName = "src/cloneBear.png";
        try {
            InputStream is = new FileInputStream(originalFileName);
            OutputStream os = new FileOutputStream(targetFileName);
            int readByteNo;
            byte[] readBuff = new byte[100];
            while ((readByteNo = is.read(readBuff)) != -1) { // readByteNo 몇 바이트 읽어야 하는지 정보가 넘어 옴
                os.write(readBuff, 0, readByteNo);
            }
            os.flush(); // write() 하고나선 flush()를 꼭 해줘야 한다.
            os.close();
            is.close();
            System.out.println("복사가 성공적으로 진행 되었습니다.");

        } catch (IOException e ) {
            e.printStackTrace();
        }

    }
}
