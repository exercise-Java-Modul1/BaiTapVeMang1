import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("độ dài của mảng thứ nhất: ");
        int n1 = sc.nextInt();
        System.out.print("độ dài của mảng thứ hai: ");
        int n2 = sc.nextInt();
        int[] array1 = new int[n1];
        int[] array2 = new int[n2];
        int n3 = n1 + n2;
        int[] array3 = new int[n3];
        System.out.println("input number for array1: ");
        for (int i = 0; i < array1.length; i++) {
            int number = sc.nextInt();
            array1[i] = number;
        }
        System.out.println("Input number for array2: ");
        for (int i = 0; i < array2.length; i++) {
            int number = sc.nextInt();
            array2[i] = number;
        }
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            array3[n1 + j] = array2[j];
        }
        System.out.println("mảng sau khi đã gộp lại: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
        }
    }
}
