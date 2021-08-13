package com.linkedinlearning.copyfile;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) {
        String sourceFile = "files/loremipsum.txt";
        String targetFile = "files/target.txt";

        // All classes within parenthesis implement method close
        try(
            FileReader fileReader = new FileReader(sourceFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter= new FileWriter(targetFile);
        ){
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                } else {
                    fileWriter.write(line + "\n");
                }
            }
            System.out.println("File copied!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // New approach for java > 7
        Path sourceFile1 = Paths.get("files", "loremipsum.txt");
        Path targetFile1 = Paths.get("files", "target1.txt");

        try {
            Files.copy(sourceFile1, targetFile1, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Using commons-io lib
        File sourceFile2 = new File("files/loremipsum.txt");
        File targetFile2 = new File("files/target2.txt");
        try {
            FileUtils.copyFile(sourceFile2, targetFile2);
            System.out.println("File copied!");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
