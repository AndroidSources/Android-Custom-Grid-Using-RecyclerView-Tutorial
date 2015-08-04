package com.androidsources.recyclergridview;

/**
 * Created by Gowtham Chandrasekar on 31-07-2015.
 */
public class RowData {

    private int wonderImage;
    private String wonderName;


    public RowData(String wonderName, int wonderImage) {
        this.wonderName = wonderName;
        this.wonderImage = wonderImage;
    }

    public int getWonderImage() {
        return wonderImage;
    }

    public void setWonderImage(int wonderImage) {
        this.wonderImage = wonderImage;
    }

    public String getWonderName() {
        return wonderName;
    }

    public void setWonderName(String wonderName) {
        this.wonderName = wonderName;
    }


}

