import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] array= {6, 8, 3, 9, 7, 4, 5};

        Scanner input = new Scanner(System.in);
        System.out.print("\n Nhập số cần chèn vào mảng: number = ");
        int number = input.nextInt();
        System.out.print("Nhập vị trí cần chèn vào mảng: index = ");
        int index = input.nextInt();
        array[index] = number ;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}