package ru.dementev.mongoservice.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Client {
    private Long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private Integer age;
}
