import java.util.Scanner;

public class CheckBit {
    static int checkBit(int A, int B){
        if((A & (1 << B)) != 0){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(checkBit(A, B));
    }
}
