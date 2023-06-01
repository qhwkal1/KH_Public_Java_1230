package 다형성복습;

public class PolyEx0601 {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        TV tv = new TV();
        Computer computer = new Computer();
        Audio audio = new Audio();

        buyer.buy(tv);
        buyer.buy(computer);
        buyer.buy(audio);
        buyer.viewInfo();

    }
}
