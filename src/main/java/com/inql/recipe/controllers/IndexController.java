package com.inql.recipe.controllers;

import com.inql.recipe.domain.Category;
import com.inql.recipe.domain.UnitOfMeasure;
import com.inql.recipe.repositories.CategoryRepository;
import com.inql.recipe.repositories.RecipeRepository;
import com.inql.recipe.repositories.UnitOfMeasureRepository;
import com.inql.recipe.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }

}
