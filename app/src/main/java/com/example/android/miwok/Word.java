package com.example.android.miwok;

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;

    public Word (String DefaultTranslation, String MiwokTranslation) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
    }

    public String getMiwokTranslation (){
        return mMiwokTranslation;
    }

    public String getDefaultTranslation (){
        return mDefaultTranslation;
    }

}
