package 쓰레드예제7;
// interrupt() 는 sleep 이 있는 상태에서만 걸 수 있다. (자고 있을때만 죽일 수 있음)
public class InterruptThread extends Thread{
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("쓰레드 실행 중......");
                Thread.sleep(1); // sleep 이 추가 되어 있음
            }
        } catch(InterruptedException e ) {
            System.out.println("인터럽트가 발생해서 쓰레드가 종료 됨.");

        }
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}
