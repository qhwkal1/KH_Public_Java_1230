package 다형성복습2;

import java.util.Scanner;

public class PolyEx0601_1 {
    public static void main(String[] args) {
        Driver driver = new Driver("곰돌이사육사");
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        SportsCar sportsCar = new SportsCar();
        Scanner sc = new Scanner(System.in);
        System.out.print("운전하고 싶은 차를 선택하시오 : [1]버스, [2]택시, [3]스포츠카 : ");
        int selMenu = sc.nextInt();
        switch (selMenu) {
            case 1 : driver.drive(bus); break;
            case 2 : driver.drive(taxi); break;
            case 3 : driver.drive(sportsCar); break;
            default:
                System.out.println("차량을 잘 못 선택했습니다.");
        }
    }
}
