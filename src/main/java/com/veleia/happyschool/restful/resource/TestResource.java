package com.veleia.happyschool.restful.resource;

import com.veleia.hs.services.aplication.TestApp;
import com.veleia.hs.services.dto.TestDto;
import com.veleia.hs.persistence.Test;
import com.veleia.hs.services.mapper.TestMapper;

public class TestResource {

    public TestDto createTest() {
        Test test = TestApp.create(null);

        TestDto testDto = TestMapper.INSTANCE.testToTestDto(test);

        return testDto;
    }
}
