package com.example.android.tourism;

public class Word {
    private static final int nil_Image = -1;
    private int mName;
    private int mImage = nil_Image;

    public Word(int Name) {
        mName = Name;
    }

    public Word(int Name, int ImageId) {
        mName = Name;
        mImage = ImageId;
    }

    public int getmName() {
        return mName;
    }

    public int getmImage() {
        return mImage;
    }

    public boolean hasImage() {
        return mImage != nil_Image;
    }
}
