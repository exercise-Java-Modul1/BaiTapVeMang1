import java.util.Scanner;

public class DemSoLanSuatHienCua1KyTuTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số lượng biến trong chuỗi: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            int number = sc.nextInt();
            array[i] = number;
        }
        System.out.print("vị trí biến đầu tiên bạn muốn kiểm tra: ");
        int position = sc.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[position] == array[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
