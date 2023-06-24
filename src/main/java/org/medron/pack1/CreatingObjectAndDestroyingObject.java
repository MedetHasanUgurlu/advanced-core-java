package org.medron.pack1;

import javax.lang.model.util.Types;
import java.io.*;
import java.util.Collection;
import java.util.Collections;

@SuppressWarnings({"java:S1128","java:S1144","java:S1128","java:S1128","java:S1186","java:S1128"})
public class CreatingObjectAndDestroyingObject {
    public static void main(String[] args) {



    }
    private static long sum() {
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }

    static void copy(String src, String dst) throws IOException {
        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst)) {
            byte[] buf = new byte[256];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        }
    }






}
