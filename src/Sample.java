// public : 접근 제한자를 의미 함(Public / protected / private)
// Class이름은 일반적으로 첫자가 대문자 이여야 함
// void는 메소드 수행 이후 반환 값이 없음을 의미
// main은 프로그램의 시작을 위치를 의미하며 JVM에 의해서 호출 된다.
// System.out은 자바의 표준 출력 클래스 임 (print, println, printf)

/*
    해당 범위가 주석가 됨
    저자 : 정경수
    Date : 2022.12.30 작성
    목적 : 샘플 프로그램
 */
public class Sample { // Sample Class
    public static void main(String[] args) {
        System.out.println(100);
        System.out.println(3.14);
        System.out.println("자바 화이팅");
        System.out.println("문자열끼리의 " + "연결도 가능 합니다.");
        System.out.printf("%d\n", 3000);
        System.out.printf("%f\n", 3.14);
    }
}
