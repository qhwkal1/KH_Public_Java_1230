package 게임만들기;
// abstract 클래스는 추상클래스로 생성한거기 때문에 객체 생성이 안됨
abstract public class Unit {
    protected String name; // 캐릭터 이름
    protected int pPower; // 피지컬 power(물리공격력)
    protected int mPower; // 매지컬 power(마법공격력)
    protected double pHit; // 물리 적중률
    protected double mHit; // 마법 적중률
    protected int ultraPower; // 궁극기(해당 캐릭터의 특수 기술)
    protected int hp; // 체력
}

