package com.company.proxy;

public class RealImage implements ImageGenerator {
    private String fullPath;

    public RealImage(String fullPath) {
        this.fullPath = fullPath;
    }

    @Override
    public void showImage() {
        System.out.println("{0} photo gosterilir: " + this.fullPath);
    }
}
