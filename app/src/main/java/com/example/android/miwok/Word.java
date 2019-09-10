package com.example.android.miwok;

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceID;

    public Word (String DefaultTranslation, String MiwokTranslation) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
    }

    public Word (String DefaultTranslation, String MiwokTranslation, int ImageResourceID) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceID = ImageResourceID;
    }

    public String getMiwokTranslation (){
        return mMiwokTranslation;
    }

    public String getDefaultTranslation (){
        return mDefaultTranslation;
    }

    public int getImageResourceID (){
        return mImageResourceID;
    }

}
