package com.example.riadh.miwok;

import android.content.Context;
import android.media.Image;
import android.support.annotation.IdRes;
import android.widget.ImageView;


public class Word {


    private static final int NO_IMAGE_PROVIDED = -1;
    /* Default translation for th word */
    private String mDefaultTranslation;
    /* Miwok translation for th word */
    private String mMiwokTranslation;
    /* Image ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Word(String defaultTranslation, String miwokTranslation) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;


    }

    public Word(String defaultTranslation, String miwokTranslation, int imageId) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageId;


    }

    /**
     * Get the Default translation of the word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageRessorceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
