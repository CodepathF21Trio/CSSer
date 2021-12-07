package com.example.csser;

public class AColor {
    private String name;
    private String hex;
    private String rgb;

    public AColor(String name, String hex, String rgb){
        this.name = name;
        this.hex = hex;
        this.rgb = rgb;
    }

    public String getName() {
        return name;
    }

    public String getHex() {
        return hex;
    }

    public String getRgb() {
        return rgb;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public void setRgb(String rgb) {
        this.rgb = rgb;
    }
}

