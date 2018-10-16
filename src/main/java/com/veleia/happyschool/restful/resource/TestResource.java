package com.veleia.happyschool.restful.resource;

import com.veleia.happyschool.persistence.Test;
import com.veleia.happyschool.restful.pojo.TestDto;
import com.veleia.happyschool.restful.service.application.TestApp;
import com.veleia.happyschool.restful.service.mapper.TestMapper;
import org.jdbi.v3.core.Jdbi;

public class TestResource {

    private final Jdbi jdbi;

    public TestResource(final Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    public TestDto createTest() {
        Test test = TestApp.create(null);

        TestDto testDto = TestMapper.INSTANCE.testToTestDto(test);

        return testDto;
    }
}
