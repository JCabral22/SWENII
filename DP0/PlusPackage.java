package org.example.DP0;
public class PlusPackage implements TVPackage{
   private int channels;
   private int download;
   private int upload;

   private String type;

   public PlusPackage(){
       this.channels = 68;
       this.upload = 125;
       this.download = 250;
       this.type = "Plus";
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
