package com.inql.recipe.repositories;

import com.inql.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long>{
}
