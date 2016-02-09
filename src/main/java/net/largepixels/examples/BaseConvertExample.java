package net.largepixels.examples;

/**
 * Created by johnminchuk on 2/8/16.
 */
public class BaseConvertExample {

    private void runMe() {

        //4 * 10^0
        //3 * 10^1
        //2 * 10^2
        //1 * 10^3

        int[] bin1 = {4,3,2,1};
        binaryToDecimal(bin1, 10);


        //1 * 2^0
        //0 * 2^1
        //1 * 2^2
        //1 * 2^3

        int[] bin2 = {1, 0, 1, 1};
        binaryToDecimal(bin2, 2);


        decimalToNegBase(9, -2);
        decimalToNegBase(-9, -2);

    }

    public void decimalToNegBase(int value, int base)
    {
        String result = "";

        while (value != 0)
        {
            int remainder = value % base;
            value = value / base;

            //https://en.wikipedia.org/wiki/Negative_base
            //if remainder is neg, add the base and +1 to value, why? nfi...
            if (remainder < 0)
            {
                remainder += Math.abs(base);
                value += 1;
            }

            result = remainder + result;
        }

        System.out.println(result);

    }


    public void binaryToDecimal(int[] binArray, int base){
        int sum = 0;
        for ( int i = 0; i < binArray.length; i++ ){
            Double mult = Math.pow(base, i);
            sum += mult * binArray[i];
        }
        System.out.println("Decimal Value: " + sum);
    }

    public static void main(String args[]) {
        BaseConvertExample baseConvertExample = new BaseConvertExample();
        baseConvertExample.runMe();
    }

}
