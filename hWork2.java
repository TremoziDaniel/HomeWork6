import java.util.Scanner;

public class hWork2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = scan.next();
        int sum = 0;

        while (num.matches("[0-9]+") && /*Integer.parseInt(num) != 0*/ !num.matches("(0)?") ) {
            sum += Integer.parseInt(num);
            num = scan.next();
        }

        System.out.println(sum);
    }
}
