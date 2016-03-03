package net.largepixels.triviaquestions.futures;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by johnminchuk on 3/3/16.
 *
 * Common Java Futures example.  Futures can allow you to continue on with program execution, without
 * having to write complex threading code
 */
public class FutureExamples {

    public String downloadContents(URL url) throws IOException {
        try(InputStream input = url.openStream()) {
            return IOUtils.toString(input);
        }
    }

    private final ExecutorService pool = Executors.newFixedThreadPool(10);

    public Future<String> startDownloading(final URL url) throws IOException {
        try(InputStream input = url.openStream()) {
            return pool.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    try (InputStream input = url.openStream()) {
                        return IOUtils.toString(input);
                    }
                }
            });
        }

    }

    private void runMe() throws Exception {

        System.out.print("let's get the page synchronously!\n\n");

        System.out.println(downloadContents(new URL("http://www.google.com")));

        System.out.println("do some processing...");
        System.out.println("do some processing...");
        System.out.println("do some processing...");

        System.out.println("\n\nlet's get the page with a Java Future!\n\n");

        final Future<String> contentsFuture = startDownloading(new URL("http://www.google.com"));

        System.out.println("do some processing...");
        System.out.println("do some processing...");
        System.out.println("do some processing...");

        //contentsFuture.cancel(true);
        System.out.println(contentsFuture.get());
    }

    public static void main(String args[]) throws Exception {
        FutureExamples futureExamples = new FutureExamples();
        futureExamples.runMe();
    }

}