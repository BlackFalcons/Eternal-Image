package com.company;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedImage source = ImageIO.read(new File("C:\\Users\\eili633\\IdeaProjects\\Eternal-Image\\images\\equipment-tab.png"));
        BufferedImage item = ImageIO.read(new File("C:\\Users\\eili633\\IdeaProjects\\Eternal-Image\\images\\22484.png"));

        source.getGraphics().drawImage(item, 30, 91, null);
        ImageIO.write(source, "png", new File("C:\\Users\\eili633\\IdeaProjects\\Eternal-Image\\images\\output_image.png"));
    }
}
