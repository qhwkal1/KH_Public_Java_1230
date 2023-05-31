package 연습문제10;
// 4번 문제
// 임의의 10개 주어졌을 해당 값으로, 오름차순 정렬하기


public class BasicTest09 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7, 9, 23, 56, 3,4,6};
        int tmp = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    tmp = arr[j];
                    arr[j]  = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }
}

//package 연습문제10;
//
//public class BasicTest10 {
//    public static void main(String[] args) {
//        int[] arr = {5, 2, 9, 1, 7, 3, 8, 4, 6, 10};
//
//        // 버블 정렬을 사용하여 오름차순으로 정렬
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    // 인접한 요소를 비교하여 교환
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//
//        // 정렬된 배열 출력
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//    }
//}
