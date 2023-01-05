package com.infomedia.spring5mvcrestcategories.repositories;


import com.infomedia.spring5mvcrestcategories.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jt on 9/24/17.
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);
}
