package com.veleia.happyschool.restful.service.mapper;

import com.veleia.hs.services.dto.TestDto;
import com.veleia.hs.persistence.Test;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper
public interface TestMapper {

    TestMapper INSTANCE = Mappers.getMapper(TestMapper.class);

    @Mapping(source = "name", target = "name")
    TestDto testToTestDto(Test test);
}
