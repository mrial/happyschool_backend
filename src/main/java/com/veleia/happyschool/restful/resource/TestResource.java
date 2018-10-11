package com.veleia.hs.services.facade;

import com.veleia.hs.services.aplication.TestApp;
import com.veleia.hs.services.dto.TestDto;
import com.veleia.hs.persistence.Test;
import com.veleia.hs.services.mapper.TestMapper;




public class TestFacade {
    public TestDto createTest()
    {
        Test test = TestApp.create(null);

        TestDto testDto = TestMapper.INSTANCE.testToTestDto(test);

        return testDto;
    }
}
