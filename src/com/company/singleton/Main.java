package com.company.singleton;

public class Main {
    public static void main(String[] args) {

        System.out.println(SingleDao.getInstance().hashCode());
        System.out.println(SingleDao.getInstance().hashCode());
        System.out.println(SingleDao.getInstance().hashCode());


    }
}
