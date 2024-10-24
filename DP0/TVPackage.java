package org.example.DP0;

public interface TVPackage {
    int getDownload();
    int getUpload();
    int getChannels();

    String getType();

    default void print(){
        System.out.println(this.getType()+" package has "+ this.getDownload()+" download and "+ this.getChannels()+ " channels");
    }
}
