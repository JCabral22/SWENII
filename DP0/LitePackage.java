package org.example.DP0;
public class LitePackage implements TVPackage{
    private int channels;
    private int download;
    private int upload;

    private String type;

    public LitePackage(){
        this.channels = 32;
        this.upload = 100;
        this.download = 100;
        this.type = "Lite";
    }


    @Override
    public int getDownload() {
        return this.download;
    }

    @Override
    public int getUpload() {
        return this.upload;
    }

    @Override
    public int getChannels() {
        return this.channels;
    }

    @Override
    public String getType() {
        return this.type;
    }

}
