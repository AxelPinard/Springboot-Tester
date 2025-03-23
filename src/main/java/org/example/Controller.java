package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@RestController
public class Controller {

    @GetMapping("/get1")
    public byte[] getPicture1() throws IOException {

        BufferedImage image = ImageIO.read(new File("src/main/resources/ZomboidLandParty1.png"));
        ByteArrayOutputStream outStreamObj = new ByteArrayOutputStream();
        ImageIO.write(image, "jpg", outStreamObj);
        byte [] byteArray = outStreamObj.toByteArray();

        System.out.println("connection");
        return byteArray;
    }

    @GetMapping("/get2")
    public byte[] getPicture2() throws IOException {

        BufferedImage image = ImageIO.read(new File("src/main/resources/IMG_6816.jpg"));
        ByteArrayOutputStream outStreamObj = new ByteArrayOutputStream();
        ImageIO.write(image, "jpg", outStreamObj);
        byte [] byteArray = outStreamObj.toByteArray();

        System.out.println("connection");
        return byteArray;
    }

    @GetMapping("/get3")
    public byte[] getPicture3() throws IOException {

        BufferedImage image = ImageIO.read(new File("src/main/resources/IMG_6815.jpg"));
        ByteArrayOutputStream outStreamObj = new ByteArrayOutputStream();
        ImageIO.write(image, "jpg", outStreamObj);
        byte [] byteArray = outStreamObj.toByteArray();

        System.out.println("connection");
        return byteArray;
    }

    @GetMapping("/get4")
    public byte[] getPicture4() throws IOException {

        BufferedImage image = ImageIO.read(new File("src/main/resources/6.jpg"));
        ByteArrayOutputStream outStreamObj = new ByteArrayOutputStream();
        ImageIO.write(image, "jpg", outStreamObj);
        byte [] byteArray = outStreamObj.toByteArray();

        System.out.println("connection");
        return byteArray;
    }

    @GetMapping("/get5")
    public byte[] getPicture5() throws IOException {

        BufferedImage image = ImageIO.read(new File("src/main/resources/500569176.jpg"));
        ByteArrayOutputStream outStreamObj = new ByteArrayOutputStream();
        ImageIO.write(image, "jpg", outStreamObj);
        byte [] byteArray = outStreamObj.toByteArray();

        System.out.println("connection");
        return byteArray;
    }
}