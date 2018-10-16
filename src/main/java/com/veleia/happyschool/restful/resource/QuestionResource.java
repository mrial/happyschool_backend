package com.veleia.happyschool.restful.resource;

import org.jdbi.v3.core.Jdbi;

public class QuestionResource {

    private final Jdbi jdbi;

    public QuestionResource(final Jdbi jdbi) {
        this.jdbi = jdbi;
    }
}
