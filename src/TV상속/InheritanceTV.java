package TV상속;

public class InheritanceTV {
    public static void main(String[] args) {
        ProductTv lgTV = new ProductTv("우리집 TV");
        lgTV.setPower(true);
        lgTV.setVolume(50);
        lgTV.setChannel(1500, false);
        lgTV.viewTV();


    }
}
