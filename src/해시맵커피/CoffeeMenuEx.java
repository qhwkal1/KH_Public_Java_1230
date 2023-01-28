package 해시맵커피;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CoffeeMenuEx {
    Map<String, MenuInfo> map = new HashMap<>();
    public static void main(String[] args) {
        CoffeeMenuEx coffee = new CoffeeMenuEx();
        coffee.makeMenu();
        coffee.selectMenu();


    }
    void makeMenu() {
        map.put("Americano",new MenuInfo("Americano",2500,"Coffee","기본 커피 입니다."));
        map.put("Espresso",new MenuInfo("Espresso",2500,"Coffee","진한 커피 입니다."));
        map.put("Latte",new MenuInfo("Latte",4000,"Coffee","우유가 들어 있어요."));
    }
    void selectMenu() {
        Scanner sc = new Scanner(System.in);
        String key = "";
        while(true) {
        System.out.print("[1]메뉴보기, [2]메뉴조회, [3]메뉴추가, [4]메뉴삭제, [5]메뉴수정, [6]종료 : ");
        int selMenu = sc.nextInt();
        switch (selMenu) {
            case 1:
                System.out.println("======== 메뉴 보기 ========");
                for(String e : map.keySet()) {
                    System.out.println("메뉴 : " + map.get(e).name);
                    System.out.println("가격 : " + map.get(e).price);
                    System.out.println("분류 : " + map.get(e).group);
                    System.out.println("설명 : " + map.get(e).desc);
                    System.out.println("==============================");
                }
                break;
            case 2:
                System.out.print("조회할 메뉴를 입력하세요 : ");
                key = sc.next();
                if(map.containsKey(key)) {
                    System.out.println("메뉴 : " + map.get(key).name);
                    System.out.println("가격 : " + map.get(key).price);
                    System.out.println("분류 : " + map.get(key).group);
                    System.out.println("설명 : " + map.get(key).desc);
                } else System.out.println("해당 메뉴가 존재하지 않습니다.");
                break;
            case 3:
                System.out.print("추가 할 메뉴를 입력 하세요 : ");
                key = sc.next();
                if(map.containsKey(key)) {
                    System.out.println("해당 메뉴가 이미 존재 합니다.");
                } else {
                    System.out.print("가격 : ");
                    int price = sc.nextInt();
                    System.out.print("분류 : ");
                    String group = sc.next();
                    sc.nextLine();
                    System.out.print("설명 : ");
                    String desc = sc.nextLine();
                    map.put(key,new MenuInfo(key, price, group, desc));
                }
                break;
            case 4:
                System.out.println("삭제할 메뉴를 입력 하세요 : ");
                key = sc.next();
                if(map.containsKey(key)) {
                    map.remove(key);
                    System.out.println(key + "메뉴를 삭제했습니다");
                } else {
                    System.out.println("삭제할 메뉴가 없습니다");
                }
                break;

            case 5:
                System.out.println("수정할 메뉴를 입력 하세요 : ");
                key = sc.next();
                int price;
                String group;
                String desc;
                String name;
                if(map.containsKey(key)) {
                    System.out.print("바꿀 이름 입력하세요 : ");
                    name = sc.next();
                    System.out.print("바꿀 가격을 입력하세요 :");
                    price = sc.nextInt();
                    System.out.print("바꿀 카테고리를 입력하세요 : ");
                    group = sc.next();
                    System.out.print("바꿀 메뉴에 대한 설명을 입력하세요 : ");
                    desc = sc.next();
                    map.replace(key ,new MenuInfo(name,price,group,desc));
                    System.out.println("----------바뀐 메뉴 정보는---------");

                        System.out.println("메뉴 : " + map.get(key).name);
                        System.out.println("가격 : " + map.get(key).price);
                        System.out.println("분류 : " + map.get(key).group);
                        System.out.println("설명 : " + map.get(key).desc);
                        System.out.println("==============================");

                } else {
                    System.out.println("수정 할 메뉴가 없습니다.");

                }
            case 6:
                System.out.println("메뉴를 종료 합니다");
                return;
            default:
                System.out.println("없는 메뉴 입니다. 메뉴를 다시 선택 하세요.");

            }
        }
    }
}
