package com.kodyin.recipe.services;

import com.kodyin.recipe.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
}
