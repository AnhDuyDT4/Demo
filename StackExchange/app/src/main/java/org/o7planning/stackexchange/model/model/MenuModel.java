package org.o7planning.stackexchange.model.model;

/**
 * Created by Custom on 15-Nov-17.
 */

public class MenuModel {
    private int mImg;
    private String mName;
    public MenuModel(int img,String Name){
        this.mImg  = img;
        this.mName = Name;
    }

    public int getmImg() {
        return mImg;
    }

    public void setmImg(int mImg) {
        this.mImg = mImg;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}
