package 인터페이스복습1;

public interface NetAdapter {
    void connect();
    void send(String msg);

}

class WiFi implements NetAdapter {

    @Override
    public void connect() {
        System.out.println("연결 완료 !!!");
    }

    @Override
    public void send(String msg) {
        System.out.println("WIFI >>" + msg);

    }
}

class FiveG implements NetAdapter {

    @Override
    public void connect() {
        System.out.println("5G 연결 완료");
    }

    @Override
    public void send(String msg) {
        System.out.println("5G >>" + msg);
    }
}