package com.example.MongoDB.Entity;

import com.example.MongoDB.Address;
import com.example.MongoDB.Type;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document("student")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    private Integer random;
    private Address address;
    @BsonProperty(value = "random float")
    private Double randomFloat;
    private Boolean big;
    private Date date;
    private String regEx;
    @BsonProperty(value = "enum")
    private Type type;
}
