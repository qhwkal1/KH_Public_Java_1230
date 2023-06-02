package 인터페이스리모콘;

public class Audio implements RemoteControlEx{
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("Audio 를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio 를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControlEx.MAX_VOLUME) {
            this.volume = RemoteControlEx.MAX_VOLUME;
        } else if(volume < RemoteControlEx.MIN_VOLUME) {
            this.volume = RemoteControlEx.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨 : " + this.volume);
    }
    void getInfo() {
        System.out.println("오디오 입니다.");
        System.out.println("현재 Audio 볼륨 : " + this.volume);
    }
}
