package 인터페이스리모콘;

public interface RemoteControlEx {
    int MAX_VOLUME = 100; // 자동으로 상수로 변경됨 (final static)
    int MIN_VOLUME = 0;
    void turnOn(); // 자동으로 추상 메소드가 됨 (public abstract)
    void turnOff();
    void setVolume(int volume);
    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }

    // 디폴트 메소드 : jdk 1.8 이후에 추가되었다, 인터페이스 상속인 예외처리를 위해서 사용
    default void setMute(boolean mute) {
        if(mute) System.out.println("무음처리합니다.");
        else System.out.println("무음을 해제 합니다.");
    }
}
