package com.infomedia.spring5mvcrestcategories.api.v1.mapper;

import com.infomedia.spring5mvcrestcategories.api.v1.model.CategoryDTO;
import com.infomedia.spring5mvcrestcategories.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);


    CategoryDTO categoryToCategoryDTO(Category category);
}