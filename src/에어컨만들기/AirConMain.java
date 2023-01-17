package 에어컨만들기;
import java.util.Scanner;
import static java.lang.Thread.sleep;

public class AirConMain {
    public static void main(String[] args) throws InterruptedException {
        AirCon aircon = new AirCon();
        Scanner sc = new Scanner(System.in);
        int elapsedTime = 0; // 경과 시간
        boolean isSetTemp = false; // 현재 온도를 변경해야 할 타이밍
        System.out.print("에어컨을 켜시겠습니까?(yes / no) :  ");
        String isON = sc.next();
        if(isON.equalsIgnoreCase("yes")) {
            aircon.setPower(true); // 에어컨 켜기
            aircon.setAirConState(); // 에어컨의 온도 및 바람세기 설정
            while (true) {
                sleep(1000); // 1000ms => 1초
                elapsedTime++; // 경과 시간은 1초 마다 증가
                switch (aircon.getWindStep()) {
                    case 1 :
                        if(elapsedTime >= 60) isSetTemp = true; break;
                    case 2 :
                        if(elapsedTime >= 30) isSetTemp = true; break;
                    case 3 :
                        if(elapsedTime >= 20) isSetTemp = true; break;
                    default :
                }
                if(isSetTemp) {
                    if(aircon.isHeater()) aircon.setCurrTemp(1);
                    if(aircon.isCooler()) aircon.setCurrTemp(-1);
                    aircon.airConInfo();
                    isSetTemp = false;
                    elapsedTime = 0;
                }
                if(aircon.getCurrTemp() == aircon.getSetTemp()) {
                    System.out.println("에어컨을 종료 합니다.");
                    break;
                }
            }
        }
    }
}
