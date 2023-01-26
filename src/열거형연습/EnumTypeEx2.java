package 열거형연습;
// 타입 체크를 할 수 있다라는게 큰 장점
public class EnumTypeEx2 {
    public static void main(String[] args) {
        Developer developer = new Developer("김정민 ",DevType.BACKEND,Career.JUNIOR,Gender.MALE);
        developer.devInfo();
        Developer developer1 = new Developer("곰돌이 ",DevType.FRONTEND,Career.JUNIOR,Gender.FEMALE);
        developer1.devInfo();

    }
}
