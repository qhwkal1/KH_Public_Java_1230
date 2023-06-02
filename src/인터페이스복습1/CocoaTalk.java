package 인터페이스복습1;

public class CocoaTalk {
    private String to; // 상대방 이름
    private String msg; // 전달 할 메시지
    public CocoaTalk(String name) {
        to = name;

    }
    public void writeMsg(String msg) {
        this.msg = to + " : " + msg;
    }
    public void send(NetAdapter netAdapter) {
        netAdapter.send(msg);

    }
}