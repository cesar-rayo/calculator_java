package com.linkedinlearning.requests;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Main {
    private static final String FLOWERS_FEED =
            "https://services.hanselandpetal.com/feeds/flowers.xml";

    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            URL url = new URL(FLOWERS_FEED);
            inputStream = url.openStream();
            bufferedInputStream = new BufferedInputStream(inputStream);
            StringBuilder stringBuilder = new StringBuilder();

            while (true) {
                int data = bufferedInputStream.read();

                if (data == -1) {
                    break;
                } else {
                    // Read/Add each char in the response
                    stringBuilder.append((char)data);
                }
            }
            System.out.println(stringBuilder);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
            bufferedInputStream.close();
        }
    }
}
