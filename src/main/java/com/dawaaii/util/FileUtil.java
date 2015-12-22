package com.dawaaii.util;

import java.io.File;

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
}
