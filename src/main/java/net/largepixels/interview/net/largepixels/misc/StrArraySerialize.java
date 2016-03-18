package net.largepixels.interview.net.largepixels.misc;

import java.util.Arrays;

/**
 * Created by johnminchuk on 3/9/16.
 */
public class StrArraySerialize {

    private void runMe() {
        String[] arr = new String[] { "10289edjaj98askjhdf9q8wdkjhsd", "lq2ijlakmsod9jfalskd", "walkxjclkajso90axn" };

        System.out.println(Arrays.toString(arr));

        String seralized = serialize(arr);

        System.out.println("The serialized array looks like: " + seralized);
    }

    private String serialize(String[] arr) {

        StringBuilder header = new StringBuilder();
        StringBuilder serialized = new StringBuilder();
        for ( String str : arr ) {
            header.append(str.length() + "XXX");
        }


        return null;
    }

    public static void main(String args[]) {
        StrArraySerialize strArraySerialize = new StrArraySerialize();
        strArraySerialize.runMe();
    }
}
