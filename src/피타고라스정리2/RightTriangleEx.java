package 피타고라스정리2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class RightTriangleEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int[] arr = new int[3];
        while (true) {
            int sum = 0;
            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            if(sum == 0) break;
            Arrays.sort(arr);
            if((arr[2] * arr[2]) == (arr[0] * arr[0]) + (arr[1] * arr[1])) {
                list.add("right");
            }else list.add("wrong");
         }
        for(String e : list) System.out.println(e + " ");
    }
}
