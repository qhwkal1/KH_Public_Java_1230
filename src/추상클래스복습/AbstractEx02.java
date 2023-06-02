package 추상클래스복습;

// 추상 클래스 생성 : 객체 생성 불가
public class AbstractEx02 {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("갤럭시 S21");
        smartPhone.setPower(true);
        smartPhone.call();
        smartPhone.internet();

    }
}
