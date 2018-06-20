import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bạn muốn mảng có bao nhiêu kí tự: ");
        int n = sc.nextInt();
        int[] array1 = new  int[n];
        int[] array2 = new  int[n-1];
        System.out.println("Mời bạn nhập vào các giá trị cho mảng 1: ");
        for (int i = 0; i < array1.length; i++) {
            int number = sc.nextInt();
            array1[i] = number;
        }
        System.out.print("Bạn muốn xóa đi phần tử ở vị trí số mấy: ");
        int delete = sc.nextInt();
        for (int i = 0; i < delete; i++) {
            array2[i] = array1[i];
        }
        for (int j = delete - 1; j < array2.length; j++) {
            array2[j] = array1[j + 1];
        }
        System.out.println("Các giá trị mới của mảng là: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "\t");
        }
    }
}
