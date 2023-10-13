public class Main {
    public static void main(String[] args) {
        Utils.check(-1, -2, -3);
        Utils.check(1, -2, -3);
        Utils.check(-1,2,-3);
        Utils.check(-1, -2, 3);
        Utils.check(1, 2, -3);
        Utils.check(1, -2, 3);
        Utils.check(-1, 2, 3);
        Utils.check(1, 2, 3);
    }
}
