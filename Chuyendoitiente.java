import java.util.Scanner;
public class Chuyendoitiente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double USD,VND;
        System.out.println("Nhập vào số tiền(USD):");
        USD = scanner.nextDouble();
        VND= USD*23000;
        System.out.printf("Số tiền sau khi chuyển đổi (VND):"+VND);


    }
}
