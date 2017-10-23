package com.inql.recipe.repositories;

import com.inql.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long>{
}
