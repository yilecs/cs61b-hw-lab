public class Max {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int maxNum = m[0];
        int index = 1;

        while (index < m.length) {
            if (m[index] > maxNum) {
                maxNum = m[index];
            }

            index += 1;
        }

        return maxNum;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};

        System.out.println(max(numbers));
    }
}
