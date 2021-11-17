package space.marsmachine.dancer;

public class DancerMain {

    public static void main(String[] args) {
        System.out.println(DancerMain.getPositionAt(5));
    }

    private static int getPositionAt(int n) {
        /* La secuencia se repite a partir del se!xto stage,
         * por lo que se puede realizar lo siguiente. De este
         * modo, el cálculo para n --> infinito es muy sencillo.
         * No es necesario hacer funciones recursivas o loops.
         */
        return new int[]{0, 1, -1, -4, -5, -3}[n % 6];
    }

}
