import java.util.Scanner;

public class TimSoNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Độ dài của mảng là bao nhiêu: ");
        int witdh = sc.nextInt();
        int[] numbers = new int[witdh];
        System.out.println("Nhập vào giá trị cho mảng: ");
        for (int i = 0; i < numbers.length; i++) {
            int number = sc.nextInt();
            numbers[i] = number;
        }
        int min = numbers[0];
        for (int j = 0; j < numbers.length; j++) {
            if (min > numbers[j]) {
                min = numbers[j];
            }
        }
        System.out.println("Giá trị lớn nhất của mảng là " + min);
    }
}
