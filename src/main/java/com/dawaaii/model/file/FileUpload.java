package com.dawaaii.model.file;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by rohit on 22/12/15.
 */
public class FileUpload {

    public int length;
    public byte[] bytes;
    public String name;
    public String type;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
