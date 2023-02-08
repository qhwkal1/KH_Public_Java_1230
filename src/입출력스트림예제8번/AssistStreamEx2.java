package 입출력스트림예제8번;
import java.io.*;

public class AssistStreamEx2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        int data = -1; // 더이상 값이 없는 상태를 의미
        long start = 0;
        long end = 0;
        fis = new FileInputStream("src/입출력스트림예제8번/bear.png");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("src/X2bear.png");
        start = System.currentTimeMillis();
        while ((data = bis.read()) != -1); {
            fos.write(data);
        }
        fos.flush();
        end = System.currentTimeMillis();
        fos.close();
        bis.close();
        fis.close();
        System.out.println("버퍼를 사용하지 않는 경우데 대한 시간 : " + (end - start) + "ms");

        fis = new FileInputStream("src/입출력스트림예제8번/bear.png");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("src/X2bear.png");
        bos = new BufferedOutputStream(fos);
        start = System.currentTimeMillis();
        while ((data = bis.read()) != -1);
        {
            bos.write(data);
        }
        bos.flush();
        end = System.currentTimeMillis();
        bos.close();
        fos.close();
        bis.close();
        fis.close();
        System.out.println("버퍼를 사용하는 경위에 대한 시간 : " + (end - start) + "ms");
    }
}
