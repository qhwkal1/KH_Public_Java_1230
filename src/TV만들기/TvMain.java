package TV만들기;

public class TvMain {
    public static void main(String[] args) {
        TvClass samsungTv = new TvClass();
        samsungTv.getTV();
        TvClass lgTv = new TvClass(true, 12, 20);


        lgTv.setChannel(18);
        lgTv.setVolume(90);
        lgTv.getTV();


    }
}
