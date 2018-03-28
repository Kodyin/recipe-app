package com.kodyin.recipe.controllers;

import com.kodyin.recipe.domain.Category;
import com.kodyin.recipe.domain.UnitOfMeasure;
import com.kodyin.recipe.repositories.CategoryRepository;
import com.kodyin.recipe.repositories.UnitOfMeasureRepository;
import com.kodyin.recipe.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;
@Slf4j
@Controller
public class IndexController {
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){
        log.debug("Getting index page");
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
