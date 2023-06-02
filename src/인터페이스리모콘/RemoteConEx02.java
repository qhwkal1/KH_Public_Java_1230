package 인터페이스리모콘;

public class RemoteConEx02 {
    public static void main(String[] args) {
        RemoteControlEx remoteControlEx = new Audio();
        remoteControlEx.turnOn();
        remoteControlEx.setVolume(120);
        ((Audio) remoteControlEx).getInfo();

    }
}
