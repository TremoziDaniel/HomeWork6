public class hWork1 {
    public static void main(String[] args) {
        startWhile();
        System.out.println("старт");
        startDoWhile();
        System.out.println("старт");
    }
    static void startWhile() {
        int x = 0;
        while (x < 5) {
            x++;
            System.out.println(x);
        }
    }

    static void startDoWhile() {
        int x = 0;
        do {
            x++;
            System.out.println(x);
        } while (x < 5);
    }
}
