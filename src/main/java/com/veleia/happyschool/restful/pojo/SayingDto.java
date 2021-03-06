package com.veleia.happyschool.restful.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

public class SayingDto {
    private long id;

    @Length(max = 3)
    private String content;

    public SayingDto() {
        // Jackson deserialization
    }

    public SayingDto(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }
}