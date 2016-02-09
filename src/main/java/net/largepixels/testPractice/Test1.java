package net.largepixels.testPractice;

/**
 * Created by johnminchuk on 2/4/16.
 */
public class Test1 {

    public static void main(String args[]) {
        Test1 test1 = new Test1();
        test1.runMe();
    }

    private void runMe() {
        int[] A = new int[8];
        A[0] = -1;
        A[1] =  3;
        A[2] = -4;
        A[3] =  5;
        A[4] =  1;
        A[5] = -6;
        A[6] =  2;
        A[7] =  1;

        System.out.println("Looks like we found a match at index: " + solution(A, 7));

    }

    int solution(int A[], int N) {
    for (int n = 0; n < N; n++) {
            Boolean equal = firstHalfEqualsSecondHalf(A, N, n);
            if (equal) {
                return n;
            }
        }

        return -1;
    }

    Boolean firstHalfEqualsSecondHalf(int A[], int N, int current){
        int sumFirstHalf = 0 ;
        for ( int i = 0; i < 3; i++ ) {
            sumFirstHalf += A[i];
        }

        int sumSecondHalf = 0;
        for ( int i = current + 1; i <= N; i++ ) {
            sumSecondHalf += A[i];
        }

        if ( sumFirstHalf == sumSecondHalf )
            return true;
        else
            return false;
    }

}
