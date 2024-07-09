public class DrawTriangle {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            int count = 0;
            while (count < i) {
                System.out.print("*");
                count += 1;
            }

            System.out.println("");
            i += 1;
        }
    }
}
