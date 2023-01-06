package 다중어레이;
// 2차원 배열 : 행과 열의 존재함
public class DoubleArray {
    public static void main(String[] args) {
        int [][] arr = new int[2][3];
        int k = 10;
        for (int i = 0; i < arr.length; i++) { // 행에 대한 길이
            for (int j = 0; j < arr[i].length; j++) { // 열에 대한 길이
                arr[i][j] = k;
                k += 10;
            }
        }
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }
}
