package 다중For문;
// 구구단 찍기
public class DoubleFor {
    public static void main(String[] args) {
        for(int i = 2; i < 10; i++) {
            for(int j =1; j < 10; j++){
                System.out.printf("%d x %d = %d\n", i, j, (i*j));
            }
            System.out.println("-------------------");
        }
    }
}
