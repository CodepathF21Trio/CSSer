package com.example.csser;

public class Swatch {
    private int rgb;
    private int bodyTextColor;

    public Swatch(int rgb, int bodyTextColor) {
        this.rgb = rgb;
        this.bodyTextColor = bodyTextColor;
    }

    public int getBodyTextColor() {
        return bodyTextColor;
    }

    public void setBodyTextColor(int bodyTextColor) {
        this.bodyTextColor = bodyTextColor;
    }

    public int getRgb() {
        return rgb;
    }

    public void setRgb(int rgb) {
        this.rgb = rgb;
    }
}
