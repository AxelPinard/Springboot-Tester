package org.example;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ClientSide {

    public static void main(String[] args) throws IOException {
        String URLInput;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            try {
                System.out.println("Select a picture to grab (1,2,3,4,5): ");
                URLInput = scanner.next();


                BufferedImage image = ImageIO.read(new URI("http://localhost:8080/get" + URLInput).toURL());

                File outputfile = new File("src/main/java/org/example/output.png");

                ImageIO.write(image, "png", outputfile);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}