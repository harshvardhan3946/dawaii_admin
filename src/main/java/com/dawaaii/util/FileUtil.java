package com.dawaaii.util;

import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by rohit on 22/12/15.
 */
public class FileUtil {
    public static boolean createDirectoryIfNotExist(String filePath){
        File file = new File(filePath);
        if(!file.exists()){
            return file.mkdirs();
        }
        return true;
    }

    public static void saveFile(String path, byte[] bytes){
        Path pathToFile = Paths.get(path);
        try {
            Files.createDirectories(pathToFile.getParent());
            File file = new File(path);
            FileCopyUtils.copy(bytes, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}