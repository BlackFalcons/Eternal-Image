package com.falcon;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        //TODO Remove usage of absolute path on all local files.
        BufferedImage source = ImageIO.read(GetFile("images\\equipment-tab.png"));
        BufferedImage item = ImageIO.read(GetFile("images\\22484.png"));

        AddToImage(source, item, 30, 91);
        AddToImage(source, item, 70, 91);
        SaveImage(source, "png", GetFile("images\\output_image.png"));
    }

    public static File GetFile(String fileName) {
        String filePath = new File("").getAbsolutePath() + "\\";
        return new File(filePath + fileName);
    }

    public static void AddToImage(BufferedImage MainImage, BufferedImage ImageToAdd, int x, int y) {
        MainImage.getGraphics().drawImage(ImageToAdd, x, y, null);
    }

    public static void SaveImage(BufferedImage SourceImage, String FileEncoding, File SavePath) throws IOException {
        ImageIO.write(SourceImage, FileEncoding, SavePath);
    }
}
