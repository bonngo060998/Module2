public class KiemTra100SoNguyenTo {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố trong khoảng 0 đến 100");
        for (int i = 0; i <= 100; i++) {
            if (check_Primes(i)) {
                System.out.println(i );
            }
        }
    }

    public static boolean check_Primes(int number) {
        boolean flag = true;
        if (number < 2) {
            flag = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }


}