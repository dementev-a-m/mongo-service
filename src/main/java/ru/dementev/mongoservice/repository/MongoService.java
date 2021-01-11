package ru.dementev.mongoservice.repository;

public interface MongoService {
    <T> T findById(Object id, Class<T> tClass);

    <T> T save(T object);
}
