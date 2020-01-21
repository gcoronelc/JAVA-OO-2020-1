package uni.sistemas.service;

import java.util.List;

public interface ICrudDao<T> {

    //definir las firmas
    void create(T a) throws Exception;

    void update(T a) throws Exception;

    void delete(T a) throws Exception;

    List<T> readAll() throws Exception;

    T find(int a) throws Exception;

}
