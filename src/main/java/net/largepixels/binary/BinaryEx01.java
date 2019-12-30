package net.largepixels.binary;

public class BinaryEx01 {

    /*
    Java Examples from https://catonmat.net/low-level-bit-hacks
     */

    public static void main(String[] args) {
        BinaryEx01 binaryEx01 = new BinaryEx01();
        binaryEx01.runMe();
    }

    private void runMe() {

        System.out.println("\n\n37 OR 35");
        printIt(37);
        printIt(35);
        printIt(37 | 35);

        System.out.println("\n\n37 AND 35");
        printIt(37);
        printIt(35);
        printIt(37 & 35);

        System.out.println("\n\n37 XOR 35");
        printIt(37);
        printIt(35);
        printIt(37 ^ 35);

        System.out.println("\n\nNOT 37");
        printIt(37);
        printIt(~37);

        System.out.println("\n\n37 SHIFT LEFT BY 1 to muliply by 2");
        printIt(37);
        printIt(37 << 1 );

        System.out.println("\n\n37 SHIFT RIGHT BY 2 to divie by 4");
        printIt(37);
        printIt(37 >> 2 );

        System.out.println("\n\n37 AND 1 to see if it is and odd number");
        printIt(37);
        printIt(1);
        printIt(37 & 1 );

        System.out.println("\n\n38 AND 1 to see if it is an odd number");
        printIt(38);
        printIt(1);
        printIt(38 & 1 );

        System.out.println("\n\ntest if the 2nd bit is set on 37");
        System.out.println("slide a bit over 2 spaces.  Remember index starts at 0");
        printIt(1 << 2);
        printIt(37 );
        printIt(37 & ( 1 << 2 ) );
        int x = 37 & ( 1 << 2 );
        if (x > 0 ) {
            System.out.println("The result of ANDing these together is positive, therefore 37 has a 1 in the 2nd bit space");
        }

        System.out.println("\n\nUse OR to set the nth bit");
        System.out.println("create a representation of the bit we want to set");
        printIt(1 << 3);
        printIt(37 );
        printIt(37 | ( 1 << 3 ) );

        System.out.println("\n\nTurn on all bits except the nth with NOT");
        System.out.println("create a representation of the only bit we want off");
        printIt(1 << 3);
        printIt( ~(1<<3) );
        System.out.println("Result after we apply a NOT to it");

        System.out.println("\n\nToggle nth bith with trick above and XOR ");
        printIt(1 << 2);
        printIt(37);
        printIt( 37 ^ (1<<2) );
        System.out.println("Result after we apply a XOR to it");


        System.out.println("\n\nLets turn off the rightmost bit.  First subtract one.  Note what it does to these numbers.");
        printIt(40);
        printIt( 40 - 1);
        printIt( 104);
        printIt( 104 -1);
        printIt( 704);
        printIt( 704 -1);
        System.out.println("So take a binary num like 40 and subtract 1");
        printIt(40);
        printIt(40-1);
        System.out.println("Then AND it with itself to turn off rightmost bit");
        printIt(40 & (40-1));

        System.out.println("\n\nIsolate the rightmost bit.  First let's see 37 as pos and neg");
        printIt(44);
        printIt(-44);
        System.out.println("You can also get to the neg represntation with NOT");
        printIt(~44);
        System.out.println("But don't forget a Java int represents neg nums with the twos complement system.");
        System.out.println("Let's add that 1 to fix it");
        printIt((~44) + 1 );
        System.out.println("Now that we have the neg representation, simply AND it with itself ");
        printIt(44);
        printIt(44 & ((~44) + 1 ));

    }

    private void printIt(int binNum) {
        //32 bits of precision because ints are 32 bits long
        System.out.println(
                String.format(
                        "%32s", Integer.toBinaryString(binNum)
                ).replaceAll(" ", "0") + " :" + binNum
        );
    }

}
