package ru.dementev.mongoservice.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MongoServiceImpl implements MongoService {
    private final MongoTemplate mongoTemplate;

    @Override
    public <T> T findById(Object id, Class<T> tClass) {
        return mongoTemplate.findById(id, tClass);
    }

    @Override
    public <T> T save(T object) {
        return mongoTemplate.save(object);
    }

}
