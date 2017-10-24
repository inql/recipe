package com.inql.recipe.repositories;

import com.inql.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category,Long>{

    Optional<Category> findByDescription(String descprition);

}
