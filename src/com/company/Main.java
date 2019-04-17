package com.company;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

    public static void main(String[] args)  {

//        String fileSource ="C:\\Users\\user\\AppData\\Roaming\\Factorio\\saves\\_autosave2.zip";
//        String fileDest = "C:\\Users\\user\\Google Диск\\_autosave2.zip";
//
//        try {
//            Path source = Paths.get(fileSource), dest = Paths.get(fileDest);
//            Files.copy(source, dest);
//        }catch (IOException ex){
//            System.out.println("Input / Output Error");
//        }

        CopyThreed copyThreed = new CopyThreed();
        copyThreed.start();
    }
}
