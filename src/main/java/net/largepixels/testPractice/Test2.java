package net.largepixels.testPractice;

/**
 * Created by johnminchuk on 2/4/16.
 */
public class Test2 {

    private void runMe() {

        int[] A = new int[7];
        A[0] = 4;
        A[1] =  4;
        A[2] = 1;
        A[3] =  7;
        A[4] =  2;
        A[5] = 3;
        A[6] =  4;

        int sol = solution(4, A);

        System.out.println("test" + sol);
    }

    /**
     *
     * @param X balance value
     * @param A balanced array
     * @return  the index at which the first half of matches equals the second half of misses
     */
    public int solution(int X, int[] A) {

        int ne = 0;
        int eq = 0;

        for ( int i = 1; i < A.length; i++) {
            for (int x = 0; x < i; x++ ) {
                if ( A[x] == X ) {
                    eq++;
                }
            }

            for (int x = i; x < A.length; x++ ) {
                if ( A[x] != X ) {
                    ne++;
                }
            }

            if ( ne == eq ) {
                return i;
            }

            ne = 0;
            eq = 0;
        }

        return -1;
    }

    public static void main(String args[]) {
        Test2 test1 = new Test2();
        test1.runMe();
    }

}
