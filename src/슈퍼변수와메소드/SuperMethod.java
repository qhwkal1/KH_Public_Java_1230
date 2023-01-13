package 슈퍼변수와메소드;
// super : 자식 클래스가 부모클래스로 부터 상속 받은 필드를 참조할 때 사용하는 참조 변수
public class SuperMethod {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();

    }
}
class Parent {
    int a;
//    Parent() {
//        a = 10;
//    }
    Parent(int n) {
        a = n;
    }
}
class Child extends Parent {
    int b;
    Child() {
        super(100);
        b = 20;
    }
    void display () {
        System.out.println(a);
        System.out.println(b);
    }
}