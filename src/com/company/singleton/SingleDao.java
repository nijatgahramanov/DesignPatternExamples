package com.company.singleton;

import java.util.Objects;

public final class SingleDao {
    private String name;
    public static SingleDao dao = null;

    private SingleDao() {
    }

    public static SingleDao getInstance() {
        if (dao == null) {
            dao = new SingleDao();
        }
        return dao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SingleDao singleDao = (SingleDao) o;
        return Objects.equals(name, singleDao.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
