package 상속과인터페이스;

public abstract class Chat {
    Chat() {}
    public void sendMessage() {
        System.out.println("메세지를 전송합니다.");
    }
    public void rcvMsg() {
        System.out.println("메세지를 받습니다.");
    }
    abstract String testName();
}
