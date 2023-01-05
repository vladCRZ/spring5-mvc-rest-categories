package com.infomedia.spring5mvcrestcategories.services;

import com.infomedia.spring5mvcrestcategories.api.v1.model.CategoryDTO;

import java.util.List;

public interface CategoryService {

    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String Name);
}
