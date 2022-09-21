package com.company.proxy;


public class ProxyImage implements ImageGenerator {
    private RealImage rImage;
    private String fullPath;

    public ProxyImage(String fullPath) {
        this.fullPath = fullPath;
    }

    @Override
    public void showImage() {
        if (rImage == null) {
            rImage = new RealImage(fullPath);
        }
        this.rImage.showImage();
    }
}
