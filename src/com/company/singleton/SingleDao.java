package com.company.singleton;

import java.util.Objects;

public class SingleDao {
   private static final SingleDao INSTANCE = new SingleDao();

    private SingleDao() {
    }

    public static SingleDao getInstance(){
        return INSTANCE;
    }

}
