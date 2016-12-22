package com.dhinojosac.android.myrecyclerview.model;

import android.media.Image;
import android.widget.ImageView;

/**
 * Created by negro-PC on 21-Dec-16.
 */
public class RowData {
    private String textRow;
    private int imageRow;

    public RowData() {
        this.textRow = "Text in row";
        this.imageRow = 1;
    }

    public RowData(String textRow, int imageRow) {
        this.textRow = textRow;
        this.imageRow = imageRow;
    }
    public String getTextRow() {
        return textRow;
    }

    public void setTextRow(String textRow) {
        this.textRow = textRow;
    }

    public int getImageRow() {
        return imageRow;
    }

    public void setImageRow(int imageRow) {
        this.imageRow = imageRow;
    }
}
