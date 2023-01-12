package 클래스상속;
// 상속(Inheritance) : 부모 클래스의 기능(필드, 메소드)을 그대로 물려 받는 것
// 접근제한자 특성에 영향을 받음
public class Inheritance {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("푸들");
        System.out.println(dog1.name);
        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy 가 ");
        houseDog.sleep();
        houseDog.sleep("슈나우저가 ");
        houseDog.sleep(3);


    }
}
