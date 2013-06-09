package com.heroku.charizard.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "payments")
public class Payment {

    @Id private ObjectId id;
    public String date;
    public String name;
    public String checkNumber;
    public float amount;

}
