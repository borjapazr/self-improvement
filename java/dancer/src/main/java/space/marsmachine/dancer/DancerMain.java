package space.marsmachine.dancer;

public class DancerMain {

    public static void main(String[] args) {
        System.out.println(DancerMain.getPositionAt(5));
    }

    private static int getPositionAt(int n) {
        /* The sequence is repeated from the sixth stage onwards,
         * so the following can be done. In this way, the calculation
         * for n --> infinity is very simple.
         * way, the calculation for n --> infinity is very simple.
         * It is not necessary to do recursive functions or loops.
         */
        return new int[]{0, 1, -1, -4, -5, -3}[n % 6];
    }

}
