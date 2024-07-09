public class DrawTriangleMethod {
    public static void drawTriangle(int size) {
        int row = 0;

        while (row < size) {
            int col = 0;

            while (col <= row) {
                System.out.print("*");
                col += 1;
            }

            System.out.println("");

            row += 1;
        }
    }

    public static void main(String[] args) {
        drawTriangle(5);
    }
}
