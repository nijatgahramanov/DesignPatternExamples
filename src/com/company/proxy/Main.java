package com.company.proxy;

public class Main {
    public static void main(String[] args) {

        ProxyImage proxyImage1 = new ProxyImage("C:\\photo1.jpg");
        ProxyImage proxyImage2 = new ProxyImage("C:\\photo2.jpg");


        proxyImage1.showImage();
        proxyImage2.showImage();
        proxyImage1.showImage();


    }
}
