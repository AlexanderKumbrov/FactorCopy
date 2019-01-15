package com.company;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String fileSource ="C:\\Users\\Alex\\Desktop\\copyA\\f.txt" ;
        String fileDest = "C:\\Users\\Alex\\Desktop\\copyB\\f.txt";
        try {
            Path source = Paths.get(fileSource), dest = Paths.get(fileDest);
            Files.copy(source, dest);
        }catch (IOException ex){
            System.out.println("Input / Output Error");
        }
    }
}
