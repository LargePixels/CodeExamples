package net.largepixels.examples.java8Examples.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Runnable Java 8 examples pulled from this
 *
 * https://www.javacodegeeks.com/2014/05/java-8-features-tutorial.html
 */
public class LambdaDemo {

    private void lambda() {
        System.out.println("One liner");

        Arrays.asList( "a", "b", "d" ).forEach(
                e -> System.out.println( e )
        );

        System.out.println("\nOne liner, specify input type");

        Arrays.asList( "a", "b", "d" ).forEach( ( String e ) -> System.out.println( e ) );

        System.out.println("\nBrackets for multiple statements");

        Arrays.asList( "a", "b", "d" ).forEach( e -> {
            System.out.print( e );
            System.out.print( e );
        } );

        System.out.println("\nYou can access external variables");

        String separator = ",";
        Arrays.asList( "a", "b", "d" ).forEach(
                ( String e ) -> System.out.print( e + separator )       //inside here separator is "final"
        );

        System.out.println("\nSorting the old fashioned way");

        List<String> list = Arrays.asList("z", "a", "m", "d");
        Collections.sort(list);

        System.out.println("\nSpecify two input types");

        list = Arrays.asList("z", "a", "m", "d");
        list.sort( ( e1, e2 ) -> e1.compareTo( e2 ) );

        list = Arrays.asList("z", "a", "m", "d");
        list.sort( ( e1, e2 ) -> {
            int result = e1.compareTo( e2 );
            return result;                                              //one liners don't need input types
        } );

    }

    public static void main(String[] args) {
        LambdaDemo lambdaDemo = new LambdaDemo();
        lambdaDemo.lambda();
    }

}
