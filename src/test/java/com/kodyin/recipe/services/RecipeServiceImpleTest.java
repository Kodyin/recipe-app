package com.kodyin.recipe.services;

import com.kodyin.recipe.domain.Recipe;
import com.kodyin.recipe.repositories.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class RecipeServiceImpleTest {
    RecipeServiceImple recipeServiceImple;
    @Mock
    RecipeRepository recipeRepository;
    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);
        recipeServiceImple = new RecipeServiceImple(recipeRepository);
    }
    @Test
    public void getRecipes() throws Exception{
        Recipe recipe = new Recipe();
        HashSet recipeData = new HashSet();
        recipeData.add(recipe);
        when(recipeServiceImple.getRecipes()).thenReturn(recipeData);
        Set<Recipe> recipes = recipeServiceImple.getRecipes();
        assertEquals(recipes.size(), 1);
        verify(recipeRepository, times(1)).findAll();
    }
}