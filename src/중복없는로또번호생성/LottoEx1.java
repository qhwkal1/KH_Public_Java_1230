package 중복없는로또번호생성;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1. 6개의 로또 번호 생성해서 출력하기 (배열 사용)
// 2. 중복 없는 로또 번호 생성 후 출력
// 3. ArrayList 사용해서 출력 (중복 없음)
// 4. Set 을 이용해서 로또 번호 출력 (중복 없음)
// 중복 없는 로또 번호 생성 하기 (1~45 6개번호)
public class LottoEx1 {
    public static void main(String[] args) {
        //6개의 배열 생성
        // 반복문을 순회 하면서 랜덤함수를 이용해 배열에 로또번호 추가
        // 마지막에 배열에 포함된 로또 번호 출력
        List<Integer> lotto = new ArrayList<>();
        int tmp;
        while (true) {
            tmp = (int)((Math.random() * 45) + 1);
            if(!lotto.contains(tmp)) lotto.add((tmp));
            if (lotto.size() == 6) break;
        }
        System.out.println(lotto);
//        int[] ball = new int[6];
//        int tmp, index = 0;
//        boolean isExist = false; // 로또 배열에 지금 생성한 값과 동일한 값이 있는지 확인
//
//        while(true) {
//            tmp = (int)((Math.random() * 45) + 1);
//            for(int i = 0; i < ball.length; i++) {
//                if(ball[i] == tmp) isExist = true;
//            }
//            if(isExist == false) ball[index++] = tmp; //해당 인덱스에 값을 반영하고 증가 시킴
//            if(index == 6) break;
//            isExist = false;
//        }
//        System.out.println(Arrays.toString(ball));
    }
}










/*    int[] ball = new int[6];
        for(int i = 0; i < ball.length; i++) {
        ball[i] = (int)((Math.random() * 45) + 1);
        }
        System.out.println(Arrays.toString(ball));
        }
*/