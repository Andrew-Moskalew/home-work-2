import org.w3c.dom.ls.LSOutput;

public class Utils {
        public static void check(int x, int y, int z) {
            System.out.println("x=" + x + ", y=" + y + ", z=" +z);
        int s = 0;
        if (x > 0) {
            s += 1;
        }
        if (y > 0) {
            s += 1;
        }
        if (z > 0) {
            s += 1;
        }
        switch (s) {
            case 0:
                System.out.println("bad");
                break;
            case 1:
                System.out.println("fine");
                break;
            case 2:
                System.out.println("good");
                break;
            case 3:
                System.out.println("excellent");
                break;
            default:
                break;
        }
    }
}
