package 생성자;
// 1. 생성자는 클래스이름과 같고 반환 타입이 없음
// 2. 접근제한자는 사용할 수 있으며 기본적으로 public 이거나 default 이다. 특별한 경우에 한해서 private 사용 됨
// 3. 하나의 클래스는 사용 목적에 따라 여러 개의 생성자를 가질 수 있음(생성자 오버로딩)
public class ConstructorEx {
    public static void main(String[] args) {
        Car ev6 = new Car(); // 빈 생성자 호출
        Car santafe = new Car("Santafe");
        Car sorento = new Car("Sorento", "2021");
        Car g90 = new Car("Genesis G90", "2022", "Black");
        Car kona = new Car("Kona", "2019", "Blue", 200);

        ev6.getCar();
        santafe.getCar();
        sorento.getCar();
        g90.getCar();
        kona.getCar();

    }
}
class Car {
    String name;
    String year;
    String color;
    int maxSpeed;
    Car() {
    }
    // 생성자 오버로딩 규칙은 매개변수 타입이나 개수를 가지고 구분
    Car(String name) {
        this.name = name;
    }
    Car(String name, String year) {
        this.name = name;
        this.year = year;
    }
    Car(String name, String year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }
    Car(String name, String year, String color, int speed) {
        this.name = name;
        this.year = year;
        this.color = color;
        maxSpeed = speed;
    }

    void getCar() {
        System.out.println("=== Car Information ===");
        System.out.println("이름 : " + name);
        System.out.println("연식 : " + year);
        System.out.println("색상 : " + color);
        System.out.println("속도 : " + maxSpeed);
    }
}