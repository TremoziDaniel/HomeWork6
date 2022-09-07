import java.math.BigInteger;
import java.util.Scanner;

public class hWork3 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите факториал");
        String factorialNum = scan.next();

        factorialValue(inspectNum(factorialNum));
    }

    static void factorialValue(int factorialNum) {
        int i = 0;
        int x = 1;
        int factorialValue;
        do{
            i++;
            factorialValue = x * i;
            x = factorialValue;
        }while(i < factorialNum); //Ура, я нашел применение do while :)
        System.out.printf("Факториал числа %d равняется %d", factorialNum, factorialValue);
    }

    static int inspectNum (String Num) {
        while (true) {
            if (Num.matches("(.*)[\\-\\.\\,\\sa-zA-Z](.*)")) {
                System.out.println("Неправильное значение");
                Num = scan.next();
            } else
                break;
        }
        return Integer.parseInt(Num);
    }
}
