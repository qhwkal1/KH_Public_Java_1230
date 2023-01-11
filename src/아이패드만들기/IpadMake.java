package 아이패드만들기;

public class IpadMake {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            IpadPro iPad = new IpadPro("iPad Pro");
            if(!iPad.continueOrder()) break;
            iPad.setScreen();
            iPad.setColor();
            iPad.setMemory();
            iPad.setNetwork();
            iPad.setName();
            iPad.setSerialNum();
            iPad.inProduction();
            iPad.viewProductPad();
        }
    }
}
