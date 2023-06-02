package 추상클래스복습;

public abstract class Phone {
    public String name;
    public boolean isPower;
    public Phone(String name) {
        this.name = name;
    }
    public void setPower(boolean isPower) {
        this.isPower = isPower;
        if(isPower) {
            System.out.println("Phone Power ON");
        } else {
            System.out.println("Phone Power OFF");
        }
    }
    abstract void call();
}

class SmartPhone extends Phone {

    public SmartPhone(String name) {
        super(name);
    }

    @Override
    void call() {
        System.out.println("부모의 요청으로 통화 기능을 구현 합니다.");
    }
    public void internet() {
        System.out.println("인터넷 기능을 추가합니다.");
    }
}