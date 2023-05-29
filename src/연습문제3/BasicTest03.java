package 연습문제3;
// 중복없는 로또 번호 생성하기 : 1 ~ 45 임의의 수 6개

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class BasicTest03 {
    public static void main(String[] args) {
        List<Integer> lottoList = new Vector<>();
        for(int i = 1; i < 45; i++) {
            lottoList.add(i);
            Collections.shuffle(lottoList);
        }
        lottoList = lottoList.subList(0, 6);
        System.out.println("랜덤로또번호 : " + lottoList);
        System.out.println("배고프다아아아아아앙아아아아아아아아아아아아아아아아아아아아아아ㅏ아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아");
    }
}
